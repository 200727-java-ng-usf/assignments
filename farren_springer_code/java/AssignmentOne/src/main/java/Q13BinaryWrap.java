public class Q13BinaryWrap {

    /**
     * This class has a method called that wraps a string and displays
     * substrings separated by line.
     * @param theStringToBeWrapped
     * @return
     */
    public static String wrapTheString (String theStringToBeWrapped) {

        /**
         * Initialize the result to empty.
         */
        String result = "";

        /**
         * The string will be split into four lines.
         */
        for (int i = 0; i < 4; i++) {
            /**
             * Make a substring that holds an increasing amount of characters
              */
            result += theStringToBeWrapped.substring(0, i*2) + "\n";
        }
        /**
         * Return the result.
         */
        return result;
    }

    /**
     * The main method demonstrates the use of the wrapTheString method.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Declare and initialize the string specified in the question.
         */
        String onesAndZeros = "0 1 0 1 0 1 0 1 0 1 ";

        /**
         * This will demonstrate the use of the wrapTheString method to the console.
         */
        System.out.println(wrapTheString(onesAndZeros));

    } // end main

} // end class
// done
