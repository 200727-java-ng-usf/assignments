package mainpackage;
import java.util.Scanner;

public class NumberOfCharacters {
    public NumberOfCharacters() {
        String string = "I am learning core Java";
        System.out.println("Initial string: " + string);
        count(string);
    }
    public static void count(String string) {
                string.toCharArray();
        int character = 0;
        for (int i = 0; i < string.length(); i++) {
            character++;
        }
        System.out.println("Number of characters: " + character);

    }

}
