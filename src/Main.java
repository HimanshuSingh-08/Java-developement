import javax.xml.crypto.Data;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.print("Hello this is my first java code");

        //-------------------Data Types ------------------//
//        int num_int = 1;
//        double num_double = 1234567.343;
//        float num_float = 23903209;
//        char letter_char = 'H';
//        String name_string ="Himanshu Singh";
//        System.out.println(num_int);
//        System.out.println(num_double);
//        System.out.println(num_float);
//        System.out.println(letter_char);
//        System.out.println(name_string);


        //------------------------Swap two integers -----------------------//
        int a = 420;
        int b = 204;

        int temp ;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a-b;
        System.out.println(a + " " + b);

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);

   }
}