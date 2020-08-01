import java.util.Arrays;
import java.util.Scanner;

public class QuestionFour {

    public static int factorial(int n) {

        // find all numbers that descend from N
        int[] n_descending = new int[n];

        // store those numbers in the array
        for (int i = 0; i < n_descending.length; i++) {
            n_descending[i] = i + 1;
        }
        // create a variable to store the ans
        int ans = 1;

        //multiply the numbers
        for(int r = n_descending.length; r > 0; r--) {
            ans *= r;
        }
        return ans;

    }

    public static void main(String[] args) {

        System.out.println("Enter your integer: ");
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();
        int finalAns = factorial(yourNumber);
        System.out.println(finalAns);

        /* Testing


        // take an integer input from the user
        int n = 7;

        // find all numbers that descend from N
        int[] n_descending = new int[n];
        System.out.println(Arrays.toString(n_descending)); // test to see if numbers input correctly

        // store those numbers in the array
        for (int i = 0; i < n_descending.length; i++) {
            n_descending[i] = i + 1;
        }

        System.out.println(Arrays.toString(n_descending)); // test to see if numbers input correctly

        // create a variable to store the ans
        int ans = 1;

        //multiply the numbers
        for(int r = n_descending.length; r > 0; r--) {
            ans *= r;
        }
        System.out.println(ans);

         end testing */
    }


} // done
