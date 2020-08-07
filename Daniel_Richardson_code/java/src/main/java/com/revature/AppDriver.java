package com.revature;

import com.sun.javaws.IconUtil;

import java.util.Arrays;

public class AppDriver {
    public static void main(String[] args) {

        System.out.println("Begin Assignment:");
        //---------Q1------------------
        System.out.println("\n----------Q1");
        int[] q1Array = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        Q1.arrayDisplay(q1Array, true);
        q1Array = Q1.bSort(q1Array);
        Q1.arrayDisplay(q1Array, false);
        System.out.println("\n----------Q2");

        //---------Q2------------------
        System.out.println("Q2: ");
        int[] fArray = Q2.fSeq(25);
        Q1.arrayDisplay(fArray, false);
        System.out.println("\n----------Q3");

        //---------Q3------------------
        String newStr = new String("Hello World");
        System.out.println(newStr);
        newStr = Q3.strRev(newStr);
        System.out.println(newStr);
        System.out.println("\n----------Q4");

        //---------Q4------------------
        int factorialNum = 5;
        factorialNum = Q4.factorial(factorialNum);
        System.out.println(factorialNum);
        System.out.println("\n----------Q5");

        //---------Q5------------------
        String str = "everyday i'm hustlin";
        int idx = 5;
        //System.out.println(Q5.subStrEZ(str, idx)); //only for TRYHARDS
        System.out.println(Q5.subStrHD(str, idx));
        System.out.println("\n----------Q6");

        //---------Q6------------------
        int maybeEven = 77;
        System.out.println("Even? " + Q6.evenOrNot(maybeEven));
        System.out.println("\n----------Q7");

        //---------Q7------------------
        Q7.employeeSort();
        System.out.println("\n----------Q8");

        //---------Q8------------------
        Q8.palinD();
        System.out.println("\n----------Q9");

        //---------Q9------------------
        Q9 q9 = new Q9();
        q9.primeList();
        System.out.println("\n----------Q10");

        //---------Q10------------------
        int num1 = 9;
        int num2 = 9;
        System.out.println("The minimum is: "+Q10.min(num1, num2));
        System.out.println("\n----------Q11");

        //---------Q11------------------
        System.out.println("Q11 Float Vars: "+Q11.pckgAccessor());
        System.out.println("\n----------Q12");

        //---------Q12------------------
        Q12 q12 = new Q12();

        System.out.println("\n----------Q13");

        //---------Q13------------------
        Q13.offbrandTriforce();
        System.out.println("\n----------Q14");

        //---------Q14------------------
        //Q14.caseSw();
        System.out.println("\n----------Q15");

        //---------Q15------------------
        Q15 q15 = new Q15();
        System.out.println(q15.add(5,7));
        System.out.println(q15.sub(10,5));
        System.out.println(q15.div(10,2));
        System.out.println(q15.mult(2,9));
        System.out.println("\n----------Q16");

        //---------Q16------------------
        Q16 q16 = new Q16();
        q16.argReciever(args);
        System.out.println(q16.strCounter(args));
        System.out.println("\n----------Q17");

        //---------Q17------------------
        Q17 q17 = new Q17();
        System.out.println("Interest: "+q17.usury());
        System.out.println("\n----------Q18");

        //---------Q18------------------
        Q18Sub q18 = new Q18Sub();
        System.out.println("Uppercase? "+q18.upperCaseCheck());
        System.out.println("All uppcase: "+q18.forceUpperCase());
        System.out.println("Pull ints+10: "+q18.stringToInt());
        System.out.println("\n----------Q19");

        //---------Q19------------------
        Q19 q19  = new Q19();
        q19.aList();
        System.out.println("\n----------Q20");

        //---------Q20------------------
        Q20.dataRead();



    }
}
