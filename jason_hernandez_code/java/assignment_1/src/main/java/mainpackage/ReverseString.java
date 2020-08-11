package mainpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    private List<Character> listOfCharacters;

    ReverseString() {

        // Begin with a string
        String string = "Revature Java";
        System.out.println(string);
        // Break it down by characters
        List<Character> chars = new ArrayList<Character> ();

        // Convert to arraylist
        for (char ch : string.toCharArray()) {
            chars.add(ch);
        }
        System.out.println(chars);

        listOfCharacters = chars;
    }

    // Next, reverse the arraylist
    public static List<Character> reverseList(List<Character> list) {
        List<Character> reverse = new ArrayList<>(list.size());
        list.stream()
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(reverse::add);

        return reverse;
    }

    public void reverseString() {
        List<Character> reverse = reverseList(listOfCharacters);
        System.out.println(reverse);
    }
}


