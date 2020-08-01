import jdk.internal.util.xml.impl.Input;
import java.util.Scanner;

public class Q3 {

    static String rev = "";

    public static void reverseIt(String str) {
        for(int i = str.length() -1; i >= 0; i--) {

            rev += str.charAt(i);
        }
        System.out.println("This is the string backwards: " + rev);
    }

    public static void main(String[] args) {

        String s = "Hello"; // the string
        System.out.println("Here is the string: "+s); // test
        reverseIt(s);

            }

    }
