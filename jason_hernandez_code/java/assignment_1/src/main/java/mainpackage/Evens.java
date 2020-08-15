package mainpackage;

import java.util.ArrayList;

public class Evens {
    public void getEvens() {
        // Initialize array
        ArrayList<Integer> numbers2 = new ArrayList<Integer>(100);
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(50);

        // Populate the first array with integers 1 to 100
        for (int i = 1; i <= 100; i++) {
            numbers2.add(i);

           // Check each number to see if it is even
            for (int j = 1; j <= numbers2.size(); j++)
                if (i%2 == 0) {
                    // If so add it to the second array
                    if(!evenNumbers.contains(i))
                    evenNumbers.add(i);

            }

        }

        System.out.println("The Even Numbers up to 100 are " + (evenNumbers));
    }
}


