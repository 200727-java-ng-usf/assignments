package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindromes {

    ArrayList checkForPalindromes() {

        // Start with two ArrayLists, original and palindromes
        ArrayList originalStrings = new ArrayList<String>();
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
        Scanner in = new Scanner(System.in);

        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        // Check if reverse is the same as original
        if (original.equals(reverse))
            palindromeStrings.add(reverse);

        System.out.println(palindromeStrings);

        return palindromeStrings;
    }
}
