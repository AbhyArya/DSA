import java.util.ArrayList;
import java.util.Scanner;

public class muku2 {

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


        int ans = -1;
        int j=0;
        int sum =0;

        boolean flag = true;
        for(int i=0; i<n ;i++){

            if(flag) {
                while (j < al.get(i).length) {
                    sum+=arr[i][j];
                    if(isPerfectSquare(sum)){
                       ans = sum;
                    }
                    j++;
                }
                j--;
            }
            else{
                while (j >= 0) {
                    sum+=arr[i][j];
                    if(isPerfectSquare(sum)){
                        ans = sum;
                    }
                    j--;
                }
                j++;
            }
            flag = !flag;
        }

        System.out.println(ans);
    }
}
