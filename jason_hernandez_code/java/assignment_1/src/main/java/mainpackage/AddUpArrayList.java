package mainpackage;
import java.util.ArrayList;

public class AddUpArrayList {

    public void addUpArraylist() {
        // Initialize three arrayLists and int[]
        ArrayList<Integer> numbers3 = new ArrayList<Integer>(10);
        ArrayList<Integer> evenNumbers2 = new ArrayList<Integer>(5);
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>(5);
        int[] nonPrime = new int[10];

        // Populate the first array with integers 1 to 100
        for (int i = 1; i <= 10; i++)
            numbers3.add(i);

        // Check each number to see if it is even
        int temp;
        boolean isEven = true;

        for (int j = 2; j <= numbers3.size() / 2; j++) {
            temp = numbers3.size() % 2;
            if (temp == 0) {
                isEven = false;
                break;
            }
            //If isEven is true then the number is even else not
            if (isEven)
                evenNumbers2.add(j);
            else
                oddNumbers.add(j);

            // Add up the even numbers
            double sumEven = 0;
            for (int k : evenNumbers2) {
                sumEven += k;
            }

            // Add up the odd numbers
            double sumOdd = 0;
            for (int h : evenNumbers2) {
                sumOdd += h;
            }

            // Remove prime numbers
            for (int i = 1; i <= 100; i++) {

                // Start each one at default setting false
                boolean isPrime = false;

                // Iterate through the numbers
                numbers3.set(i, i);
                for (j = 2; j < i; j++) {

                    // Check for remainders
                    if (i % j != 0) {
                        // If a no-remainder division is found, number is not prime
                        isPrime = true;
                        break;
                    }
                    //If isPrime is true then the number is prime else not
                    nonPrime = new int[0];
                    if (!isPrime)
                        nonPrime[j] = numbers3.get(j);

                }

                System.out.println("Sum of Even numbers: " + sumEven);
                System.out.println("Sum of odd numbers: " + sumOdd);
                System.out.println("The non-prime numbers are" + nonPrime);
            }
        }
    }
}
