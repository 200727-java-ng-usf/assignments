import java.util.Arrays;

public class QuestionNineteen {

    public static void main(String[] args) {

       /*
       Create an ArrayList and insert integers 1 through 10. Display
       the ArrayList. Add all the even numbers up and display the
       result. Add all the odd numbers up and display the result.
       Remove the prime numbers from the ArrayList and print out
       the remaining ArrayList.
        */

        int[] myArray = new int[10];

        for(int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }

        System.out.println(Arrays.toString(myArray));

        int sumEven = myArray[1] + myArray[3] + myArray[5] + myArray[7] + myArray[9];
        System.out.println(sumEven);

        int sumOdd = myArray[0] + myArray[2] + myArray[4] + myArray[6] + myArray[8];
        System.out.println(sumOdd);

        // check for prime numbers
        // instead of num, parse through the numbers in the array
        int num = 29; // this would be a temp variable where the numbers are stored
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        // remove prime numbers from the ArrayList and print the remaining.

    }

}