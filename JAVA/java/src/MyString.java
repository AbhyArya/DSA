package JAVA_DSA;//immutable
//reference type

public class MyString {
    public static void main(String[] args) {
        String str= "hello";
        String str2= new String("hello"); // use to create new reference variable of same string
        String str3;//by default value is null
        str3="hello";
        System.out.println(str+str2+str3);

        str.length();
        str.toLowerCase();
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        System.out.println(str == str3);






        //string builder
        StringBuilder stb= new StringBuilder("hello");//it is mutable
        StringBuffer s3 = new StringBuffer("hello");//mutable and also thread safe
    }
}
