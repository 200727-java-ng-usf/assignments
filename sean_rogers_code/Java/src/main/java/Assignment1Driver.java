import java.util.ArrayList;

public class Assignment1Driver {
    public static void main(String[] args) {

        {
            //Question 1 test
            Question1 question1 = new Question1();
            int[] ar1 = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
            int[] expectedOutput = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
            question1.bubbleSort(ar1);
            boolean isSorted = true;
            for (int i = 0; i < ar1.length; i++) {
                if (ar1[i] != expectedOutput[i]) {
                    isSorted = false;
                    break;
                }
            }
            // replace System.out.println with assert
            System.out.println(isSorted);
            System.out.println();// new line
        }

        {
            //Question 2 test
            StringBuilder expectedOutput = new StringBuilder("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 ");
            Question2 question2 = new Question2();
            // replace System.out.println with assert
            System.out.println(question2.fibonacci(25).toString().equals(expectedOutput.toString()));
            System.out.println();// new line
        }

        {
            //Question 3 test
            Question3 question3 = new Question3();
            String input = "This is a Str!ng";
            StringBuilder expectedOutput = new StringBuilder(input);
            expectedOutput.reverse(); // THE REVERSE METHOD IS NOT USED IN THE ACTUAL SOLUTION! JUST THE TEST CASE!
            // replace System.out.println with assert
            System.out.println(question3.reverseString(input).toString().equals(expectedOutput.toString()));
            System.out.println();// new line
        }

        {
            //Question 4 test
            Question4 question4 = new Question4();
            // replace System.out.println with assert
            System.out.println(question4.factorial(5) == 120);
            System.out.println();// new line
        }

        {
            //Question 5 test
            Question5 question5 = new Question5();
            String input = "Revature";
            // replace System.out.println with assert
            System.out.println(question5.subString(input, 4).toString().equals(input.substring(0, 3).toString()));
            System.out.println();// new line
        }

        {
            //Question 6 test
            Question6 question6 = new Question6();
            int input = 5;
            // replace System.out.println with assert
            System.out.println(question6.isEven(input) == false);
            System.out.println();// new line
        }

        {
            //Question 7 test
            Question7 question7 = new Question7();

            Employee[] expectedOutput1 = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
            Employee[] twoEmployees1 = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
            question7.sortTwoEmployees(twoEmployees1);

            // replace System.out.println with assert
            System.out.println(expectedOutput1[0].getName().compareTo(twoEmployees1[0].getName()) == 0 &&
                    expectedOutput1[0].getDepartment().compareTo(twoEmployees1[0].getDepartment()) == 0 &&
                    expectedOutput1[0].getAge() == twoEmployees1[0].getAge());
            System.out.println();// new line

            Employee[] expectedOutput2 = {new Employee("aaaa", "aaad", 20), new Employee("aaab", "aaac", 20)};
            Employee[] twoEmployees2 = {new Employee("aaab", "aaac", 20), new Employee("aaaa", "aaad", 20)};
            question7.sortTwoEmployees(twoEmployees2);
            // replace System.out.println with assert
            System.out.println(expectedOutput2[0].getName().compareTo(twoEmployees2[0].getName()) == 0 &&
                    expectedOutput2[0].getDepartment().compareTo(twoEmployees2[0].getDepartment()) == 0 &&
                    expectedOutput2[0].getAge() == twoEmployees2[0].getAge());
            System.out.println();// new line

            Employee[] expectedOutput3 = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
            Employee[] twoEmployees3 = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
            question7.sortTwoEmployees(twoEmployees3);
            // replace System.out.println with assert
            System.out.println(expectedOutput3[0].getName().compareTo(twoEmployees3[0].getName()) == 0 &&
                    expectedOutput3[0].getDepartment().compareTo(twoEmployees3[0].getDepartment()) == 0 &&
                    expectedOutput3[0].getAge() == twoEmployees3[0].getAge());
            System.out.println();// new line

            Employee[] expectedOutput4 = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "efgh", 20)};
            Employee[] twoEmployees4 = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "efgh", 20)};
            question7.sortTwoEmployees(twoEmployees4);
            // replace System.out.println with assert
            System.out.println(expectedOutput4[0].getName().compareTo(twoEmployees4[0].getName()) == 0 &&
                    expectedOutput4[0].getDepartment().compareTo(twoEmployees4[0].getDepartment()) == 0 &&
                    expectedOutput4[0].getAge() == twoEmployees4[0].getAge());
            System.out.println();// new line

            Employee[] expectedOutput5 = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "ffgh", 20)};
            Employee[] twoEmployees5 = {new Employee("bbcd", "ffgh", 20), new Employee("abcd", "efgh", 20)};
            question7.sortTwoEmployees(twoEmployees5);
            // replace System.out.println with assert
            System.out.println(expectedOutput5[0].getName().compareTo(twoEmployees5[0].getName()) == 0 &&
                    expectedOutput5[0].getDepartment().compareTo(twoEmployees5[0].getDepartment()) == 0 &&
                    expectedOutput5[0].getAge() == twoEmployees5[0].getAge());
            System.out.println();// new line

            Employee[] expectedOutput6 = {new Employee("abcd", "efgh", 21), new Employee("bbcd", "ffgh", 20)};
            Employee[] twoEmployees6 = {new Employee("abcd", "efgh", 21), new Employee("bbcd", "efgh", 20)};
            question7.sortTwoEmployees(twoEmployees6);
            // replace System.out.println with assert
            System.out.println(expectedOutput6[0].getName().compareTo(twoEmployees6[0].getName()) == 0 &&
                    expectedOutput6[0].getDepartment().compareTo(twoEmployees6[0].getDepartment()) == 0 &&
                    expectedOutput6[0].getAge() == twoEmployees6[0].getAge());
            System.out.println();// new line








        }

        {
            //Question 8 test
            ArrayList<String> al = new ArrayList<String>();
            String[] input = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
            for(String word : input) {
                al.add(word);
            }

        }

    }
}
