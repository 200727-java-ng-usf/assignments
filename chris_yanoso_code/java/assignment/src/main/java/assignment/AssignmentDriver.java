package assignment;

import assignment.questions.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssignmentDriver {

    public static void main(String[] args){
        Q1 question1 = new Q1();
        int[] array1 = {1,0,5,6,3,2,3,7,9,8,4};
        System.out.println("Question 1: ");
        question1.sortArray(array1);

        Q2 question2 = new Q2();
        System.out.println("Question 2: ");
        question2.nFib(25);

        Q3 question3 = new Q3();
        System.out.println("Question 3: ");
        question3.reverseAString("Hello");

        Q4 question4 = new Q4();
        System.out.println("Question 4: ");
        question4.nFactorial(5);

        Q5 question5 = new Q5();
        System.out.println("Question 5: ");
        question5.partOfString();
        System.out.println("");

        Q6 question6 = new Q6();
        System.out.println("Question 6: ");
        System.out.println(question6.isEven(7));

        Q7 question7 = new Q7();
        System.out.println("Question 7: ");
        question7.sortEmployees();

        Q8 question8 = new Q8();
        System.out.println("Question 8: ");
        question8.palindromeTest();

        Q9 question9 = new Q9();
        System.out.println("Question 9: ");
        question9.primeNumbers();

        Q10 question10 = new Q10();
        System.out.println("Question 10: ");
        int num10 = question10.findMin(5,6);
        System.out.println("minimum number is: " + num10);

        Q11 question11 = new Q11();
        System.out.println("Question 11: ");
        question11.accessFloats();

        Q12 question12 = new Q12();
        System.out.println("Question 12: ");
        question12.even100();

        Q13 question13 = new Q13();
        System.out.println("Question 13: ");
        question13.trianglePrint(4);

        Q14 question14 = new Q14();
        System.out.println("Question 14: case 1: ");
        question14.switchMethod(1);
        System.out.println("Question 14: case 2: ");
        question14.switchMethod(2);
        System.out.println("Question 14: case 3: ");
        question14.switchMethod(3);

        Q15 question15 = new Q15();
        System.out.println("Question 15: ");
        System.out.println("add 5 + 5: " + question15.addition(5,5));
        System.out.println("subtract 5 - 5: " + question15.subtraction(5,5));
        System.out.println("multiply 5 * 5: " + question15.multiplication(5,5));
        System.out.println("divide 5 by 5: " + question15.division(5,5));

        Q16 question16 = new Q16();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question 16: ");
        System.out.println("Please enter a string:");
        String string = scanner.nextLine();
        System.out.println("Your string is " + question16.charactersInString(string) + " characters long!");

        Q17 question17 = new Q17();
        System.out.println("Question 17: ");
        question17.interestRate();

        Q18 question18 = new Q18();
        System.out.println("Question 18: ");
        System.out.println("Please enter the string to be used: ");
        String q18String = scanner.nextLine();
        System.out.println("Does your string contain an uppercase letter = " + question18.checkForUpperCase(q18String));
        System.out.println("Your string in all caps: " + question18.stringToUpperCase(q18String));
        System.out.println("Your string as an integer plus 10 is: " + question18.stringToInt(q18String));

        Q19 question19 = new Q19();
        System.out.println("Question 19: ");
        question19.oneToTenArray();

    }
}