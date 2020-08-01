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
