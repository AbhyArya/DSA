package JAVA_DSA;

import java.util.Scanner;

public class Conditional_and_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();




        //if else
        if(a>b){
            System.out.println("a>b");
        }else if(a<b){
            System.out.println("a<b");
        }
        else {
            System.out.println("a==b");
        }





        switch (a){
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(a);
                break;
            case 3:
                System.out.println(a);
            default:
                System.out.println(a);
        }





        switch (a){
            case 1 -> System.out.println(a);
            case 2 ->System.out.println(a);
            case 3 ->System.out.println(a);
            default -> System.out.println(a);
        }




        for (int i=0; i<a; i++){
            System.out.println(i);
        }




        int i=0;
        while (i!=a){
            System.out.println(i);
            i++;
        }




        while (true){
            System.out.println(i);
            if(i==100){
                break;
            }
        }



        do {
            System.out.println("this");
            i++;
        }while (i<150);






        int[] arr = {1,2,3,5,6};
        for (int value:arr) {
            System.out.println(value);
        }





    }
}
