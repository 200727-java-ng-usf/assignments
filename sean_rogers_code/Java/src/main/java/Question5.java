public class Question5 {
    public StringBuilder subString(String str, int idx) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < idx - 1; i++) {
            sb.append(str.charAt(i));
        }
        System.out.println("Substring of " + str + " at " + idx + ": " + sb);
        return sb;
    }
}
