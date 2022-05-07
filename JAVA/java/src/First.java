package JAVA_DSA; // package is folder name in which your code file is.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class First  { //class name should be same as the file name if class is public
    // if class is note public then it ok what is your class name
    public static void main(String[] args) throws IOException { //String[] args is the command line argument
        System.out.println("Hello JAVA");
        Scanner sc= new Scanner(System.in);//Scanner class
        int a= sc.nextInt();
        System.out.println(a);
        System.out.print(a);// we can use the escape sequences
        System.out.printf("%d",a);// we can use format specifiers and escape sequences
        System.out.format("%d",a);// we can use format specifiers and escape sequences

//primitive data type
//         byte , short , int , char , float , double , long , boolean
            float ft = 43.5f;// object is literals and name is identifiers



//Auto type-conversion same as the c++


// typecasting
        int ch= (int)43.6;

//input using BufferReader and InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
   }
}
