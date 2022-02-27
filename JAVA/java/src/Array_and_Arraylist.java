package JAVA_DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Array_and_Arraylist {
    public static void main(String[] args) {
        String []arr= {"this", "how"};

        int [] arr2 = new int[10];
        arr2[2] = 1;

        for (int v : arr2) {
            System.out.println(v);
        }

        ArrayList<Integer>arrlist= new ArrayList<Integer>(5);
        arrlist.add(434);
        arrlist.add(434);
        arrlist.add(434);
        for (int a: arrlist){
            System.out.println(a);
        }
    }

}
