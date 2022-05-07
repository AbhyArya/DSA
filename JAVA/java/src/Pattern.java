import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
//        fifth(n);
//        sixth(n);
//        thirteen(n);
//        fifteen(n);
//        sixteen(n);
//        twentyseventh(n);
        thirtyone(n);
    }
    static void fifth(int  n){
        int st=0;
        for(int i=0; i<2*n; i++){
            for (int j=0; j<st; j++){
                System.out.print("*");
            }
           if(i<n)
               st++;
           else
               st--;

           System.out.println();
        }

    }
    static void sixth(int  n){
        int st=0;
        for(int i=0; i<n; i++){
            for (int j=0; j<=n/2+1-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=st; j++) {
                System.out.print("*");
            }
            st+=2;
           System.out.println();
        }

    }
    static void thirteen(int  n){
        int st=0;
        for(int i=0; i<n; i++){
            for (int j=0; j<=n/2+1-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=st; j++) {
                if(j==0 || j==st || i==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            st+=2;
           System.out.println();
        }

    }
    static void fifteen(int  n){
        int st=0;
        int sd=n/2+1;
        for(int i=0; i<2*n; i++){
            for (int j=0; j<=sd; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<=st; j++) {
                if(j==0 || j==st)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(i<n-1) {
                st += 2;
                sd--;
            }
            else {
                st -= 2;
                sd++;
            }
           System.out.println();
        }

    }
    static void sixteen(int  n){
        int st=0;
        for(int i=1; i<=n; i++){
            int c = 1;
            for (int j=0; j<=n/2+2-i; j++) {
                System.out.print("\t");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(c+"\t\t");
                c = c * (i-j)/j;
            }
           System.out.println();
        }

    }
    static void thirtyone(int  n){
        int row=n;
       for (int i=1; i<2*n;i++){
           int col=n;
           for (int j=1; j<2*n; j++){
               if((j<=2*n-i && j>=i && i<=n) || (j>=2*n-i && j<=i && i>=n))
                   System.out.print(row);
               else
                   System.out.print(col);
               if(j<n) {
                   col--;
               }
               else {
                   col++;
               }
           }

           if(i<n) {

               row--;
           }
           else {

               row++;
           }
           System.out.println();
       }
    }
}

