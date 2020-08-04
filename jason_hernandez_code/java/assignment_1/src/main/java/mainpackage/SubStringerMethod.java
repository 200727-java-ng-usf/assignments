package mainpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubStringerMethod {

    public SubStringerMethod() {

        // Begin with a string
        String str = "Substringing a string";

        // Break it down into chars
        List<Character> chars = new ArrayList<>();

        // Convert to arraylist
        for(char ch: str.toCharArray()) {
            chars.add(ch);
        }

        // Get the chars between the specified indices
        String substr = chars.toString();
        System.out.println(substr);
    }
}

// Example of using the forbidden substring methods, from tutorials point
// public class StringDemo {
//
//    public static void main(String[] args) {
//
//        String str = "This is tutorials point";
//        String substr = "";
//
//        // prints the substring after index 7 till index 17
//        substr = str.substring(7, 17);
//        System.out.println("substring = " + substr);
//
//        // prints the substring after index 0 till index 7
//        substr = str.substring(0, 7);
//        System.out.println("substring = " + substr);
//    }
//}
//      Outputs:
//        substring =  tutorials
//        substring = This is
