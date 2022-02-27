import java.lang.reflect.Array;
import java.util.Arrays;

class HelloWorld {

    public static void main(String[] args) {
        for (String s :
                args) {
            System.out.println(s+args[0]);
        }
    }
}