package mainpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    private List<T> List() {

        ReverseString(Object list) {
            List = list;

            // Begin with a string
            String string = "Revature Java";
            System.out.println(string);
            List<Character> chars = new <>();

            // Convert to arraylist
            for(char ch: string.toCharArray()) {
                chars.add(ch);
            }

            System.out.println(chars);

            // Next, reverse the arraylist
            public static<T> List<T> reverseList(List<T> list) {
                List<T> reverse = new ArrayList<>(list.size());
                list.stream()
                        .collect(Collectors.toCollection(LinkedList::new))
                        .descendingIterator()
                        .forEachRemaining(reverse::add);

                return reverse;
            }
            List<> reverse = reverseList(list);
            System.out.println(reverse);
    }
    }
}
