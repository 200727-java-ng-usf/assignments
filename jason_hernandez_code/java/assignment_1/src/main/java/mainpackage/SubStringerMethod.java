package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class SubStringerMethod {

    public void subStringerMethod() {

        // Begin with a string
        String str = "Substringing a string";
        System.out.println("Original string: " + str);
        // Null substring as placeholder
        String substr = "";
        // Set an index
        int idx = 9;

        // Get the chars between the specified indices
        substr = str.substring(0, idx-1);

        System.out.println("Substring = " + substr); // Should output "Substrin"
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
