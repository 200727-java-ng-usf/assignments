package mainpackage;

import java.util.ArrayList;

public class Evens {
    public Evens() {
        // Initialize two arrays
        ArrayList<Integer> numbers2 = new ArrayList<Integer>(100);
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(100);

        // Populate the first array with integers 1 to 100
        for (int i = 1; i <= 100; i++)
            numbers2.add(i);

        // Check each number to see if it is even
        int temp;
        boolean isEven=true;

        for(int j=2; j<=numbers2/2; j++)
        {
            temp = numbers2%2;
            if(temp==0)
            {
                isEven=false;
                break;
            }
            //If isEven is true then the number is even else not
            if(isEven)
                evenNumbers.add(j);

        }
        System.out.println("The Even Numbers are " + evenNumbers);

    }
    }
}
