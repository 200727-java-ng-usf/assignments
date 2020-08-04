package com.revature;

import com.revature.Q15.Calculator;
import com.revature.Q18.stringImplement;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AssignmentDriver {
    public static void main(String[] args) {
        mainMenu();

    }





// methods area

    static void mainMenu() {
        int option = 63284623;

        while (option != 0) {
            System.out.println("  ");
            System.out.println(" ");
            System.out.println("com.revature.Assignment_1   ----------");
            System.out.println(" ");
            System.out.println("Total 20 Questions,Enter 0 to exit");
            System.out.print("please Enter the number 1-20: ");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option) {
                case 1:q1();break;
                case 2:q2();break;
                case 3:q3();break;
                case 4:q4();break;
                case 5:q5();break;
                case 6:q6();break;
                case 7:q7();break;
                case 8:q8();break;
                case 9:q9();break;
                case 10:q10();break;
                case 11:q11();break;
                case 12:q12();break;
                case 13:q13();break;
                case 14:q14();break;
                case 15:q15();break;
                case 16:q16(new String[]{"aaa","bbb"});break;
                case 17:q17();break;
                case 18:q18();break;
                default:
                    System.out.println("Wrong number try again please......");

            }
        }
    }


        static void q1 () {
            Q1 showResult = new Q1();
            int[] arrayNum = new int[]{1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
            int[] result = showResult.BubbleSort(arrayNum);
            System.out.print("BubbleSort ：");
            for (int i = 0; i < arrayNum.length; i++) {
                System.out.print(result[i] + " ");
            }
        }

        static void q2 () {
            Q2 showResult = new Q2();
            System.out.println();
            for (int i = 0; i <= 25; i++) {
                System.out.println("No." + (i + 1) + " Fibonacci = " + showResult.fibonacci(i));
            }
        }

        static void q3 () {
            Q3 showResult = new Q3();
            String str = "edcba";
            System.out.println("Original string : " + str);
            System.out.println("reversed string : " + showResult.reverse(str));

        }

        static void q4 () {
            Q4 showResult = new Q4();
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + " ! = " + showResult.factorial(i));
            }

        }

        static void q5 () {
            Q5 showResult = new Q5();
            String str = "Gu,Yuanfeng";
            System.out.println("Original String : " + str + "  index: 2 ");
            System.out.println("After substring :" + showResult.substring(str, 2));


        }
        static void q6 () {
            Q6 showResult = new Q6();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter a number: ");
            int number = scanner.nextInt();
            if (showResult.isEven(number) == true) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is odd");
            }


        }
        static void q7 () {
            TreeSet<Q7> empCompare = new TreeSet<Q7>();
            Q7 employee1 = new Q7("Justin", "IT", 30);
            Q7 employee2 = new Q7("Dave", "Sales", 20);
            Q7 employee3 = new Q7("Leo", "IT", 50);


            empCompare.add(employee1);
            empCompare.add(employee2);
            empCompare.add(employee3);

            System.out.println(" -------- Employee list ---------------");
            System.out.println("");

            for (Q7 employee : empCompare) {
                System.out.println(employee.getName() + " , " + employee.getDepartment() + " ," + employee.getAge());

            }
        }
        static void q8 () {
            Q8 showResult = new Q8();
            showResult.showArrayList();
        }

        static void q9 () {
            Q9 showResult = new Q9();
            Integer[] arrayNum = new Integer[99];
            ArrayList<Integer> primeNum = new ArrayList<Integer>();
            for (int i = 0; i < arrayNum.length; i++) {
                arrayNum[i] = i + 1;
                primeNum.add(arrayNum[i]);

            }
            showResult.printPrime(primeNum);
        }
        static void q10 () {
            Q10 showResult = new Q10();
            System.out.println("We have 5 and 9. Finding min number... ");
            System.out.println("The smaller number is : "+ showResult.minNumber(5, 9));
        }

        static void q11 () {
            Q11 showResult = new Q11();
            showResult.printFloat();
        }

        static void q12 () {
            Q12 showResult = new Q12();

            int[] arr = new int[101];
            for (int i = 0; i < 100; i++) {
                arr[i] = i + 1;
            }
            showResult.printEven(arr);
        }
        static void q13 () {
            Q13 showResult = new Q13();
            showResult.printPattern();
        }

        static void q14 () {
            Q14 showResult = new Q14();
            int option = 0;

            while (option != 4) {
                showResult.menu();
                Scanner sc = new Scanner(System.in);
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println(" The number is 4");
                        System.out.println("The answer is :" + showResult.SquareRoot(4));
                        break;
                    case 2:
                        System.out.println("----- Today's date -----");
                        showResult.today();
                        break;
                    case 3:
                        System.out.println("---  String split ---");
                        System.out.println("The String is " + "\"I am learning Core Java\"");
                        showResult.StringSplit();
                        break;
                    case 4:
                        break;

                    default:
                        System.out.println("Wrong number！");
                        break;
                }
            }
        }
        static void q15 () {
            Calculator showResult = new Calculator();
            System.out.println("2 + 3 = " + showResult.add(2, 3));
            System.out.println("3 X 3 = " + showResult.mul(3, 3));
        }

        static void q16 (String arg[]){
            Q16 showResult = new Q16();
            showResult.commandLine(arg);
        }

        static void q17 () {
            Q17 showResult = new Q17();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Your Principle : ");
            double userPrinciple = sc.nextDouble();
            System.out.println("Please Enter the time by years : ");
            int userTime = sc.nextInt();
            System.out.println("Please Enter the rate : ");
            double userRate = sc.nextDouble();
            showResult.showInterest(userPrinciple, userTime, userRate);
        }

    static void q18 () {
        stringImplement showResult = new stringImplement();
        System.out.println("Method 1) if Check Uppercase in the string ");
        System.out.println("The String is 'checkThis'  Result is "+ showResult.checkIfUpperCase("checkThis"));
        System.out.println("Method 2) Convert String to Uppercase");
        System.out.println("The String is 'check'.  Result is "+showResult.uppercaseConverter("check"));
        System.out.println("Method 3) is add ten to a string parameter ");
        System.out.print("The string is 'ten'  The result is  ");
        showResult.addTen("10");
    }
    }



