/**
 * Question 3 is dedicated to string reversal.
 * It takes an input String str.
 * Starting from the last index of str, StringBuilder sb appends each char in str
 * StringBuilder sb is then returned
 */
public class Question3 {
    public StringBuilder reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println("Reversed String: " + sb.toString());

        return sb;
    }
}
