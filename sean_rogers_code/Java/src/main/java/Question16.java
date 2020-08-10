/**
 * displays the number of characters for a string input.
 */
public class Question16 {
    public static int argsLength = 0;
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(args[0].length());
            argsLength = args[0].length();
        } else {
            System.out.println(0);
            argsLength = 0;
        }

    }
}
