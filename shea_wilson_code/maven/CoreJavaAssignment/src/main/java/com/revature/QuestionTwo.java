package com.revature;

import java.util.ArrayList;
import java.util.List;

public class QuestionTwo {



    public static ArrayList<Integer> fib(int n ){
        List<Integer> list = new ArrayList<>();
        int f1 = 0, f2 = 1, i;

        if (n < 1)
            return null;

        for (i = 1; i <= n; i++)
        {

//            System.out.print(f2+" ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
            list.add(f2);

        }
        System.out.println(list);
        return null;

    }

    public static void main(String[] args){


        fib(5);
        

    }
}
