package com.revature;

import java.util.Arrays;

public class AssignmentDriver {

    public static void main(String[] args) {
        System.out.println("Question 1: ");
        FibonacciNumbersQ2 fibNum = new FibonacciNumbersQ2(25);
        fibNum.print();

        System.out.println("+---------------------------+");
        System.out.println("Question 2: ");
        int[] sample = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
        BubbleSortQ1 bubSort = new BubbleSortQ1(sample);
        bubSort.sort();
        System.out.println("Sorted array: ");
        System.out.println(bubSort);

        System.out.println("+---------------------------+");
        System.out.println("Question 3: ");
        StringReverserQ3 flipMe = new StringReverserQ3("Reversed String");
        flipMe.reverse();
        System.out.println("Reversed String: " + flipMe);

        System.out.println("+---------------------------+");
        System.out.println("Question 4: ");
        FactorialQ4 fac6 = new FactorialQ4(6);
        fac6.print();
        FactorialQ4 fac25 = new FactorialQ4(25);
        fac25.print();

        System.out.println("+---------------------------+");
        System.out.println("Question 5: ");
        StringCutterQ5 strCut = new StringCutterQ5("String Cutter");
        int len = 9;
        strCut.cut(len);
        System.out.format("'String Cutter' trimmed at index %d produces: ", len);
        System.out.println(strCut);


        System.out.println("+---------------------------+");
        System.out.println("Question 6: ");
        EvenIntQ6 evenInt = new EvenIntQ6(1024);
        EvenIntQ6 oddInt = new EvenIntQ6(93);
        evenInt.isEven();
        oddInt.isEven();

        System.out.println("+---------------------------+");
        System.out.println("Question 7: ");
        EmployeeSorterQ7 roster = new EmployeeSorterQ7();
        roster.addEmployee("Mary Sue", "Consumer Relations", 37);
        roster.addEmployee("Mark Twain", "Enterprise Resource Planning", 21);
        // TODO: finish this after implementing Comparator

        System.out.println("+---------------------------+");
        System.out.println("Question 8: ");
        PalindromeQ8 pali = new PalindromeQ8("karan","madam","tom","civic",
                "radar","jimmy","kayak","john","refer","billy","did");
        System.out.println("Palindrome after initializing word list: ");
        System.out.println(pali);
        pali.isPalindrome();
        System.out.println("Result after filtering for palindromes: ");
        System.out.println(pali);

        System.out.println("+---------------------------+");
        System.out.println("Question 9: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 10: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 11: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 12: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 13: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 14: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 15: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 16: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 17: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 18: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 19: ");

        System.out.println("+---------------------------+");
        System.out.println("Question 20: ");

    }
}
