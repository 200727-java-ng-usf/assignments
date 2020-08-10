public class QuestionThirteen {

    public static String wrapTheString (String theStringToBeWrapped) {

        String result = "";

        // For 4 lines,
        for (int i = 0; i < 4; i++) {
            // make a substring that holds an increasing amount of characters
            result += theStringToBeWrapped.substring(0, i*2) + "\n";
        }
        return result;
    }

    public static void main(String[] args) {

        // The string from the question
        String onesAndZeros = "0 1 0 1 0 1 0 1 0 1 ";

        // Call the method
        System.out.println(wrapTheString(onesAndZeros));

    } // end main
} // end class
// done
