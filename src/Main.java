import javax.xml.crypto.Data;
import java.awt.*;

import static java.lang.Math.min;

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
//        int a = 1234567890;
//        int b = 1234567890;
//
//        int temp ;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);
//
//        a = a + b;
//        b = a - b;
//        a = a-b;
//        System.out.println(a + " " + b);
//
//        a = a^b;
//        b = a^b;
//        a = a^b;
//        System.out.println(a + " " + b);
//
//        int sa = 12;
//        int sb = 43;
//        sa = sa + sb - (sb = sa);
//        System.out.println(sa + " " + sb);

        //------------------Find Largest of three---------------//
        int num1 , num2 , num3;
        num1 = 12;
        num2 = 51;
        num3 = 3;


        //-------------Count the digits of number ---------//
//        int number = 123459234 ;
//        int cnt =0;
//        while(number > 0){
//            int digit = number %10;
//            number = number /10;
//            cnt++;
//        }
//
//        System.out.println(cnt);


        //-------------find the gcd --------//
        int a = 27 , b = 81;

        int res = Math.min(a,b);
        while(res >= 1) {
            if(a % res == 0 && b % res == 0) {
                System.out.println("GCD is: " + res);
                break;
            }
            res = res - 1;
        }
//        if(res == 1 )System.out.println("Gcd for the no is " + 1);
    }
}