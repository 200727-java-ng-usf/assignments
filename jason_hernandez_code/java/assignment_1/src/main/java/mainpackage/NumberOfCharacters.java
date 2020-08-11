package mainpackage;
import java.util.Scanner;

public class NumberOfCharacters {
    public NumberOfCharacters() {
        // Begin with a string literal
        String string = "I am learning core Java";
        System.out.println("Initial string: " + string);
        count(string);
    }
    public static void count(String string) {
                // Convert to an array of characters
                string.toCharArray();
        // Declare field for the count of characters
        int character = 0;
        for (int i = 0; i < string.length(); i++) {
            // Running total as characters are iterated
            character++;
        }
        System.out.println("Number of characters: " + character);

    }

}
