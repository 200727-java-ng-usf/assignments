import java.util.Arrays;
import java.util.ArrayList;

public class QuestionNineteen {

    // Create a method to add the even numbers in an int array
    static int addEvenNumbers (ArrayList<Integer> intArr) {
        int result = 0;

        // Parse through the int array
        for(int i = 0; i < intArr.size(); i++) {
            // If a number is even, add it to result
            if(QuestionSix.isEven(intArr.get(i))) {
                result += intArr.get(i);
            }
        }
        return result;
    }

    // Create a method to add the odd numbers in an int array
    static int addOddNumbers (ArrayList<Integer> intArr) {
        int result = 0;

        // Parse through the array
        for (int i = 0; i < intArr.size(); i++) {
            // If a number is odd, add it to result
            if (!QuestionSix.isEven(intArr.get(i))) {
                result += intArr.get(i);
            }
        }
        return result;
    }

    // Create a method to add the prime numbers
    static int addPrimeNumbers (ArrayList<Integer> intArr) {
        int result = 0;

        // Parse through the array
        for (int i = 0; i < intArr.size(); i++) {
            if(QuestionNine.isPrime(intArr.get(i))){
                result += intArr.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

       /*
       Create an ArrayList and insert integers 1 through 10. Display
       the ArrayList. Add all the even numbers up and display the
       result. Add all the odd numbers up and display the result.
       Remove the prime numbers from the ArrayList and print out
       the remaining ArrayList.
        */

        // Create an ArrayList object
        ArrayList<Integer> theArray = new ArrayList<>();

        // Add numbers 1 through 10 to the array
        for (int i = 0; i < 10; i++) {
            theArray.add(i + 1);
        }
        System.out.println("These are the Integer ArrayList object's values: " + theArray.toString());


        // Print the sum of the even numbers
        System.out.println("Here is the sum of all of the even numbers: " + addEvenNumbers(theArray));

        // Print the sum of the odd numbers
        System.out.println("Here is the sum of all of the odd numbers: " + addOddNumbers(theArray));

        // Print the sum of the prime numbers
        System.out.println("Here is the sum of all of the prime numbers: " + addPrimeNumbers(theArray));

    }

} // done