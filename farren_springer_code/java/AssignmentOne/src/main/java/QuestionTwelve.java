import java.util.Arrays;

public class QuestionTwelve {
    public static void main(String[] args) {

        // initialize the array size
        int[] hundredArray = new int[100];

        System.out.println("Here is the empty array of length 100: " + Arrays.toString(hundredArray)); // test

        // store 1 through 100 in the array
        for(int i = 1; i < 101; i++) {
            hundredArray[i-1] = i;
        }

        System.out.println("Here is the 100 array filled with numbers 1 thorugh 100: " + Arrays.toString(hundredArray)); // test

        // print the even numbers
        System.out.print("Here is a list of the even numbers in the array: ");
            for(int i : hundredArray) {
                // iterate through numbers 2 through 50; divide the number
                // in every index of hundred array to check if it
                // can be factored by that number
                if(hundredArray[i-1]%2 == 0){

                        System.out.print(hundredArray[i-1]);

                }
                else {
                    System.out.print(" ");
                }
            } // error in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100

    }
} // done