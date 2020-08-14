import java.util.ArrayList;

/**
 * This class contains three methods that operate on an ArrayList and
 * one main method to demonstrate their use.
 */

public class QuestionNineteen {

    /**
     * This method will add all the even numbers in an ArrayList of integers and return the sum.
     * @param intArr
     * @return
     */
    static int addEvenNumbers (ArrayList<Integer> intArr) {

        /**
         * An integer variable is initialized to zero.
         */
        int result = 0;

        /**
         * This loop will parse through every number in the ArrayList of
         * Integer objects specified in the parameter of the method.
         */
        for(int i = 0; i < intArr.size(); i++) {
            /**
             * If an integer is even, that integer will be added to the result.
             */
            if(Q6EvenNumber.isEven(intArr.get(i))) {
                result += intArr.get(i);
            }
        }
        /**
         * The method returns the result, which is the sum of all even integers
         * in the ArrayList.
         */
        return result;
    }

    /**
     * This method will add all the odd numbers in an ArrayList of integers and return the sum.
     * @param intArr
     * @return
     */
    static int addOddNumbers (ArrayList<Integer> intArr) {
        int result = 0;

        /**
         * This loop will parse through every number in the ArrayList of
         * Integer objects specified in the parameter of the method.
         */
        for (int i = 0; i < intArr.size(); i++) {
            /**
             * If an integer is NOT even, that integer will be added to the result.
             */
            if (!Q6EvenNumber.isEven(intArr.get(i))) {
                result += intArr.get(i);
            }
        }
        /**
         * The method returns the result, which is the sum of all odd integers
         * in the ArrayList.
         */
        return result;
    }

    /**
     * This method will remove all the prime numbers in an ArrayList and return the modified ArrayList.
     * @param intArr
     * @return
     */
    static ArrayList<Integer> removePrimeNumbers (ArrayList<Integer> intArr) {
        int result = 0;

        /**
         * This loop will parse through every number in the ArrayList of
         * Integer objects specified in the parameter of the method.
         */
        for (int i = 0; i < intArr.size(); i++) {
            /**
             * If an integer is prime, that integer will be removed from the Arraylist
             * specified in the parameter of the method.
             */
            if(Q9Primes.isPrime(intArr.get(i))){
                System.out.println(intArr.get(i) + " is prime.");
                intArr.remove(i);
            }
        }
        /**
         * The method returns an ArrayList of Integer type, which is the sum of all odd integers
         * in the ArrayList.
         */
        return intArr;
    }

    /**
     * The main method shows the implementation of the three other methods in the class.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * This will create an ArrayList object of type Integer to execute the
         * three other methods in the class.
         */
        ArrayList<Integer> theArray = new ArrayList<>();

        /**
         * This will give the ArrayList values 1 through 10.
         */
        for (int i = 0; i < 10; i++) {
            theArray.add(i + 1);
        }

        /**
         * This will output the original ArrayList.
         */
        System.out.println("These are the Integer ArrayList object's values: " + theArray.toString());


        /**
         * Here, we are showing the result of the addEvenNumbers method.
         */
        System.out.println("Here is the sum of all of the even numbers: " + addEvenNumbers(theArray));

        /**
         * Here, we are showing the result of the addOddNumbers method.
         */
        System.out.println("Here is the sum of all of the odd numbers: " + addOddNumbers(theArray));

        /**
         * Here, we are showing the result of the removePrimeNumbers method.
         */
        System.out.println("Here is the original ArrayList without the prime numbers: " + removePrimeNumbers(theArray));

    } // end main

} // end class
// done