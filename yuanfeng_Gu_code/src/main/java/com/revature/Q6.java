package com.revature;

public class Q6 {

    public boolean isEven(int num)
    {
        boolean isEven = true;

        for (int i = 1; i <= num; i++)
            isEven = !isEven;

        return isEven;
    }


}
