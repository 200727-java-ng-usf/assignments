package com.revature;

public class AssignmentDriver {
    public static void main(String[] args) {

        // q1();

        // q2();

        // q3();

        // q4();

        // q5();


    }


    static void q1() {
        Q1 showResult = new Q1();
        int[] arrayNum = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        int[] result = showResult.BubbleSort(arrayNum);
        System.out.print("BubbleSort ：");
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void q2() {
        Q2 showResult = new Q2();
        System.out.println();
        for (int i = 0; i <= 25; i++) {
            System.out.println("No." + (i + 1) + " Fibonacci = " + showResult.fibonacci(i));
        }
    }

    static void q3() {
        Q3 showResult = new Q3();
        String str = "edcba";
        System.out.println("Original string : " + str);
        System.out.println("reversed string : " + showResult.reverse(str));

    }

    static void q4() {
        Q4 showResult = new Q4();
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " ! = " + showResult.factorial(i));
        }

    }

    static void q5() {
        Q5 showResult = new Q5();
        String str = "Gu,Yuanfeng";
        System.out.println("Original String : " + str + "  index: 2 ");
        System.out.println("After substring :"+showResult.substring(str, 2));


    }
}
