package com.revature;


import java.util.Scanner;

public class AppDriver {
    //todo -- I refacted a bunch of code, and it broke most of my tests.
    //todo -- If I have time, I'll fix it.

    public static boolean defaults = false; //for default inputs or not

    public static void main(String[] args) {
        InputHandler input = InputHandler.getInstance();
        System.out.println("Use default inputs?");
        defaults = input.yesOrNo();


        System.out.println("Begin Assignment:");
        //---------Q1------------------
        System.out.println("\n----------Q1 Bubble Sort");
        Q1 q1 = new Q1();
        q1.makeArray();
        q1 = null; // i dereference this object just to watch it die
        System.out.println();

        //---------Q2------------------
        System.out.println("\n----------Q2 Fibonacci");
        Q2 q2 = new Q2();
        q2 = null;
        System.out.println();

        //---------Q3------------------
        System.out.println("\n----------Q3 String Reversal");
        Q3 q3 = new Q3();
        q3 = null;

        //---------Q4------------------
        System.out.println("\n----------Q4 Factorial");
        Q4 q4 = new Q4();
        q4 = null;

        //---------Q5------------------
        System.out.println("\n----------Q5 Substring");
        Q5 q5 = new Q5();
        q5 = null;

        //---------Q6------------------
        System.out.println("\n----------Q6 Even Integer");
        Q6 q6 = new Q6();
        q6 = null;

        //---------Q7------------------
        System.out.println("\n----------Q7 Comparator");
        Q7 q7 = new Q7();
        q7 = null;

        //---------Q8------------------
        System.out.println("\n----------Q8 Palindrome");
        Q8 q8 = new Q8();
        q8 = null;

        //---------Q9------------------
        System.out.println("\n----------Q9 Arraylist Primes");
        Q9 q9 = new Q9();
        q9 = null;

        //---------Q10------------------
        System.out.println("\n----------Q10 Minimum with Ternary");
        Q10 q10 = new Q10();
        q10 = null;

        //---------Q11------------------
        System.out.println("\n----------Q11 Other Package Floats");
        Q11 q11 = new Q11();
        q11 = null;

        //---------Q12------------------
        System.out.println("\n----------Q12 Array Evens");
        Q12 q12 = new Q12();
        q12 = null;
        System.out.println();

        //---------Q13------------------
        System.out.println("\n----------Q13 Triangle 0/1");
        Q13 q13 = new Q13();
        q13 = null;

        //---------Q14------------------
        System.out.println("\n----------Q14 Switch Case");
        Q14 q14 = new Q14();
        q14 = null;

        //---------Q15------------------
        System.out.println("\n----------Q15 Custom Math Interface");
        Q15 q15 = new Q15();
        q15 = null;

        //---------Q16------------------
        System.out.println("\n----------Q16 String[] args Characters");
        Q16 q16 = new Q16(args);
        q16 = null;

        //---------Q17------------------
        System.out.println("\n----------Q17 Interest");
        Q17 q17 = new Q17();
        q17 = null;

        //---------Q18------------------
        System.out.println("\n----------Q18 Subclass Methods");
        Q18Sub q18 = new Q18Sub();
        q18 = null;

        //---------Q19------------------
        System.out.println("\n----------Q19 ArrayList Evens, Odds, Primes");
        Q19 q19  = new Q19();
        q19 = null;

        //---------Q20------------------
        System.out.println("\n----------Q20 File Reading");
        Q20 q20 = new Q20();
        q20 = null;

        InputHandler.endScanning();

    }
}
