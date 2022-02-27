package JAVA_DSA;

import java.lang.invoke.MutableCallSite;

class MyStatic{
    static int var= 0;
    int thisis;
    MyStatic(int hello) {
        this.thisis= hello;
    var++;
    }

}
public class Static {
    public static void main(String[] args) {
        MyStatic one= new MyStatic(54);


        System.out.println(MyStatic.var);
    }

    static void greeting(){
//        giring();//can't access the non-static in static member
         Static thisSta= new Static();
         thisSta.giting();//you can access by creating object of the that class
        System.out.println("hello");
//        this.giting();// you cannot use this in static method
    }
    void giting(){
        giting2();// non-static can be access the non-static
        greeting();//static can access by the non-static member
    }
    void giting2(){
        greeting();//static can access by the non-static member
    }


}


class  InitilizationOfStaticVariable{
    static int a;
    static String str;

    static { //static block
        System.out.println("static block");
        a = 534;
        str= "Abhishek";
    }

    public static void main(String[] args) {
        InitilizationOfStaticVariable ir= new InitilizationOfStaticVariable();
        System.out.println(InitilizationOfStaticVariable.a);
    }
}









class outsideClass{// outer class is not static because it is not dependent on any other class

   static class  InnerClass{//it should be static because it is dependent on the another class

 }

}

