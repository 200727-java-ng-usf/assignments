package com.revature;
import java.util.*;

public class AssignmentDriver {
    public static void main(String[] args) {

        // q1();

        // q2();

        // q3();

        // q4();

        // q5();

        // q6();

        // q7();

        // q8();

        // q9();

        q10();


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
    static void q6() {
        Q6 showResult = new Q6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int number = scanner.nextInt();
        if(showResult.isEven(number) == true){
            System.out.println("The number is Even");
        }else {
            System.out.println("The number is odd");
        }


    }
    static void q7() {
        TreeSet<Q7> empCompare = new TreeSet<Q7>();
        Q7 employee1 = new Q7("Justin","IT",30);
        Q7 employee2 = new Q7("Dave","Sales",20);
        Q7 employee3 = new Q7("Leo","IT",50);


        empCompare.add(employee1);
        empCompare.add(employee2);
        empCompare.add(employee3);

        System.out.println(" -------- Employee list ---------------");
        System.out.println("");

        for (Q7 employee: empCompare) {
            System.out.println(employee.getName() + " , " + employee.getDepartment() + " ," + employee.getAge());

        }
    }
    static void q8() {
        Q8 showResult = new Q8();
        showResult.showArrayList();
    }

    static void q9() {
        Q9 showResult = new Q9();
        Integer[] arrayNum = new Integer[99];
        ArrayList<Integer> primeNum = new ArrayList<Integer>();
        for (int i = 0; i < arrayNum.length; i++){
            arrayNum[i]=i+1;
            primeNum.add(arrayNum[i]);

        }
        showResult.printPrime(primeNum);
    }
    static void q10() {
        Q10 showResult = new Q10();
        System.out.println(showResult.minNumber(5, 9));
    }


}
