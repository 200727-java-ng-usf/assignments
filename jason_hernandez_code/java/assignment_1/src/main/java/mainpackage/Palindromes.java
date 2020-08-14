package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindromes {

    void checkForPalindromes() {

        // Start with two ArrayLists, original and palindromes
        ArrayList<String> originalStrings = new ArrayList<>();
        originalStrings.add("karan");
        originalStrings.add("madam");
        originalStrings.add("tom");
        originalStrings.add("civic");
        originalStrings.add("radar");
        originalStrings.add("jimmy");
        originalStrings.add("kayak");
        originalStrings.add("john");
        originalStrings.add("refer");
        originalStrings.add("billy");
        originalStrings.add("did");

        ArrayList palindromeStrings = new ArrayList<String>();

        System.out.println(originalStrings);

        // Now reverse each string
        String original, reverse = "";

        for(int i = 0; i < originalStrings.size(); i++) {

            original = originalStrings.get(i);
            reverse = "";
            int length = original.length();

            for (int j = length - 1; j >= 0; j--)
                reverse = reverse + original.charAt(j);

            // Check if reverse is the same as original
            if (original.equals(reverse))
                palindromeStrings.add(reverse);
        }
        System.out.println(palindromeStrings);

    }
}
