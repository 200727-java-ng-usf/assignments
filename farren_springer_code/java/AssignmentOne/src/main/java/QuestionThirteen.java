public class QuestionThirteen {

    public static void wrapTheString (String theStringToBeWrapped) {

        // For 4 lines,
        for (int i = 0; i < 5; i++) {
            // make a substring that holds an increasing amount of characters
            System.out.println(theStringToBeWrapped.substring(0, i*2));
        }
    }

    public static void main(String[] args) {

        // The string from the question
        String onesAndZeros = "0 1 0 1 0 1 0 1 0 1";

        // Call the method
        wrapTheString(onesAndZeros);

    } // end main
} // end class
// done
