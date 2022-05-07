import java.util.ArrayList;
import java.util.Scanner;

public class muku {

    static boolean isPerfectSquare(double number)
    {
        double sqrt=Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());


        int count =0;
        ArrayList<String[]> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            String st = sc.nextLine();
            String[] t= st.split(",");
            al.add(t);
        }
        int [][] arr = new int[n][al.get(0).length];
        for(int i=0; i<n; i++){
            for (int j=0; j<al.get(0).length; j++){
                arr[i][j] = Integer.parseInt(al.get(i)[j]);
            }
        }


        ArrayList<Integer> sqn = new ArrayList<>();
         int j=0;
        int sum =0;
        ArrayList<Integer> tempAr = new ArrayList<>();;
        boolean flag = true;
        for(int i=0; i<n ;i++){

            if(flag) {
                while (j < al.get(0).length) {
                    sum+=arr[i][j];
                    System.out.print(arr[i][j]);
                    tempAr.add(arr[i][j]);
                    if(isPerfectSquare(sum)){
                        sqn.add(sum);
                        tempAr.clear();
                        sum=0;
                    }
                    j++;
                }
                j--;
            }
            else{
                while (j >= 0) {

                    System.out.print(arr[i][j]);
                    sum+=arr[i][j];
                    tempAr.add(arr[i][j]);
                    if(isPerfectSquare(sum)){
                        tempAr.clear();
                        sqn.add(sum);
                        sum=0;
                    }
                    j--;
                }
                j++;
            }
            flag = !flag;
        }
        int ans=Integer.MIN_VALUE;
        if(sqn.size()==0){
            ans = -1;
        }else {
            for (int i=0; i<sqn.size(); i++){
                ans = Math.max(ans,sqn.get(i));
            }
        }

        System.out.println(ans);
    }
}
