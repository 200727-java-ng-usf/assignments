/**
 * This class has a method isPrime to determine if a number is prime. It
 * has a main method to demonstrate the isPrime method.
 */
public class QuestionNine {

    public static boolean isPrime(int n) {
        /**
         * Declare and initialize an integer variable that will ne used to return true or false to the method.
         */
        int flag = 0;

        /**
         * A variable is assigned that is half of the integer passed as a parameter. This will be used to
         * see what is the maximum number that we should check is a factor of the parameter to be able to
         * know if it is prime.
         */
        int m=n/2;

        /**
         * If the integer passed is 0 or 1, these are special cases which are not considered prime. For all other
         * integers, check all factors from 2 to halfway to the integer.
         */
        if(n==0||n==1){
            return false;
        }else{
            for(int j=2;j<=m;j++){
                /**
                 * If the integer divided by the factor has a remainder of zero, it cannot be prime.
                 */
                if(n%j==0){
                    flag = 1;
                }
            }

            /**
             * After looping through all the numbers, the flag will be 1 if the number is not prime (false),
             * and 1 if the number is prime (true).
             */
            if(flag==0)  {
                return true;
            } else {
                return false;
            } // end if
        } // end else

    } // end isPrime

    public static void main(String[] args) {

        int[] hundredArray = new int[100];

        for(int i = 1; i < 101; i++) {
            hundredArray[i-1] = i;
        }

        System.out.print("These are the prime numbers in an array with integers 1 through 100: ");

        /**
         * Parse through the array. If the number is prime, print it.
         */
        for(int i = 0; i < hundredArray.length; i++) {
            if(isPrime(hundredArray[i])){
                System.out.print(hundredArray[i] + " ");
            } else {
                System.out.print("");
            }
        } // end for

    } // end main

} // end class
// done