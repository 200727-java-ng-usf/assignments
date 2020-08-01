package mainpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public ReverseString() {

        // Begin with a string, convert to arraylist
        String string = "Revature Java";
        List<Character> chars = new <>();

        for(char ch: string.toCharArray()) {
            chars.add(ch);
        }

        System.out.println(chars);

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
