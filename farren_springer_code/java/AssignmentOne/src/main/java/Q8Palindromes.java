import java.util.Arrays;
/**
 * This class has a method that that determines if a String is a
 * palindrome and a main method that calls the isPalindrome method.
 */
public class Q8Palindromes {

    /**
     * The counter will store the number of palindromes.
     */
    static int counter = 0;

    /**
     * The isPalindrome method will return true if the original String
     * and the reversed String are equivalent.
     * @param s
     * @param s1
     * @return
     */
    public static boolean isPalindrome(String s, String s1) {
        return s.equals(s1);
    }

    public static void main(String[] args) {

        /**
         * Creates a Q3ReverseString object to use its reverseIt method.
         */
        Q3ReverseString q3Object = new Q3ReverseString();

        /**
         * Creates a String to store reverse words.
         */
        String item = null;

        /**
         * Instantiates an array of Strings with words from the question.
         */
        String originalList[] = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};

        /**
         * Instantiates an array of Strings to store reverse words.
         */
        String[] reverse_Of_The_List = new String[originalList.length];

        /**
         * Parses through the array, reverses each word and stores it
         * in the array of Strings meant for holding reverse words.
         */
        for(int j = 0; j < originalList.length; j++){
            reverse_Of_The_List[j] = q3Object.reverseIt(originalList[j]);
        }

        /**
         * Goes through the reverse list and increment the counter
         * when a palindrome is found. Calls isPalindrme method.
         */
        for(int i = 0; i < reverse_Of_The_List.length; i++){
            if(isPalindrome(reverse_Of_The_List[i], originalList[i])){
                counter++;
            }
        }

        /**
         * Instantiates an array of Strings to hold only the palindromes.
         * It should be the same length as the counter, which counted
         * how many palindromes there are.
         */
        String[] palindromes = new String[counter];

        /**
         * Prints the results to the console.
         */
        System.out.println("Original words: " + Arrays.toString(originalList));
        System.out.println("");
        System.out.println("Words in reverse order: " + Arrays.toString(reverse_Of_The_List));
        System.out.println("");
        System.out.println("After comparing the words and their reverses, there are: " + counter + " palindromes");
        System.out.println("");

        /**
         * Initializes another counter integer to 0.
         * This counter will be used to increment the index
         * position of the String array meant to hold palindromes.
         */
        int anotherCounter = 0;

        /**
         * Goes through the String array that holds the reverse words.
         */
        for(int i = 0; i < reverse_Of_The_List.length; i++){

            /**
             * If the word is a palindrome, this if-statement stores
             * it in the String array meant to hold palindromes, and
             * increment the palindromes[] array index position by 1.
             */
            if(isPalindrome(reverse_Of_The_List[i], originalList[i])){
                palindromes[anotherCounter] = reverse_Of_The_List[i];
                anotherCounter++;
            }
        }
        /**
         * Prints the resulting palindromes using the Arrays wrapper
         * class toString method.
         */
        System.out.println("The palindromes are: " + Arrays.toString(palindromes));

    } // end main

} // end class
// done