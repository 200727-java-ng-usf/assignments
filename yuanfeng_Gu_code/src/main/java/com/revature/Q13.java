package com.revature;

public class Q13 {
    public void printPattern(){

        int i, j, k;
        k = 1;

        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
                // Print 1 if current integer k is odd
                if(k % 2 == 1)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }

                k++;
            }

            System.out.println(" ");
        }

    }


}
