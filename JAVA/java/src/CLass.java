package JAVA_DSA;
 class  Student{

    final int bonus= 32;//you can't re-assign again
    String name;
    int rno;
    float marks;
    public static int c= 12;
    Student(){
        this (12,"horll",54.54f);//calling another constructor same class using this
    }

    Student(int rno, String name, float marks){
        this.marks=marks;
        this.name= name;
        this.rno=rno;

    }
}
public class CLass {
    public static void main(String[] args) {
        Student ab= new Student(1,"Abhishek", 54.6f);
        Student vi= new Student(2,"vivek", 54.6f);
        System.out.println(ab.name);
        System.out.println(vi.name);
        final Student ak= new Student();// you can't re-assign to other class but you can change the value of the object attributes
        ak.name="je;;;";
        System.out.println(ak.name);
    }
}
