package mainpackage;

import java.util.ArrayList;

public class Evens {
    public void getEvens() {
        // Initialize two arrays
        ArrayList<Integer> numbers2 = new ArrayList<Integer>(100);
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(50);

        // Populate the first array with integers 1 to 100
        for (int i = 1; i <= 100; i++) {
//            numbers2.add(i);
//
//            // Check each number to see if it is even
//            int temp;
//            boolean isEven = false;
//
//            for (int j = 1; j <= i; j++) {
//                temp = i % 2;
                if (i%2 == 0) {
//                    isEven = true;
//                    break;
//                }
//                //If isEven is true then the number is even else not
//                if (isEven)
                    evenNumbers.add(i);

            }

        }

        System.out.println("The Even Numbers are " + (evenNumbers));
    }
}


