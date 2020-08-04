package mainpackage;
import java.util.ArrayList;

public class AddUpArrayList {
    public AddUpArrayList() {

        // Initialize three arrayLists
        ArrayList<Integer> numbers3 = new ArrayList<Integer>(100);
        ArrayList<Integer> evenNumbers2 = new ArrayList<Integer>(50);
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>(50);

        // Populate the first array with integers 1 to 100
        for (int i = 1; i <= 100; i++)
            numbers3.add(i);

        // Check each number to see if it is even
        int temp;
        boolean isEven = true;

        for (int j = 2; j <= numbers3 / 2; j++) {
            temp = numbers3 % 2;
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
            System.out.println("Sum of Even numbers: " + sumEven);
            System.out.println("Sum of odd numbers: " + sumOdd);

        }

    }}
