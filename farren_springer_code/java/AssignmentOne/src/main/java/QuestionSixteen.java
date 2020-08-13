/**
 * This class has a method that calculates the number of characters in a string
 * and a main method to demonstrate this.
 */
public class QuestionSixteen {

    /**
     * This method takes in a string and returns the number of characters in the string.
     * @param str
     * @return
     */
    static int numberOfCharactersInString(String[] str) {
        int result = 0;
        for(int i = 0; i < str[0].length(); i++) {
            if(str[0].charAt(i) != ' ') {
                result++;
            }
        }
        return result;
    } // end numberOfCharactersInString

    /**
     * The main method demonstrates the use of the numberOfCharactersInString method.
     * @param args
     */
    public static void main(String[] args) {

//        /**
//         * This creates a Scanner object to take in user input.
//         */
//        Scanner scanner = new Scanner(System.in);
//
//        /**
//         * This will ask the user for a string.
//         */
//        System.out.print("What is your string: ");
//
//        /**
//         * This will assign the user input to a String object.
//         */
//        String userString = scanner.nextLine();

        /**
         * This will call the method and print the result to the console.
         */
        System.out.println("Your string has " + numberOfCharactersInString(args) + " characters.");

    } // end main

} // end class
// done