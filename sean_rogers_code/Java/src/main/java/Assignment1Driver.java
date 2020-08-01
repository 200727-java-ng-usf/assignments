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
        }

        {
            //Question 2 test
            StringBuilder expectedOutput = new StringBuilder("0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 ");
            Question2 question2 = new Question2();
            // replace System.out.println with assert
            System.out.println(question2.fibonacci(25).toString().equals(expectedOutput.toString()));
        }

        {
            //Question 3 test
            Question3 question3 = new Question3();
            String input = "This is a Str!ng";
            StringBuilder expectedOutput = new StringBuilder(input);
            expectedOutput.reverse(); // THE REVERSE METHOD IS NOT USED IN THE ACTUAL SOLUTION! JUST THE TEST CASE!
            // replace System.out.println with assert
            System.out.println(question3.reverseString(input).toString().equals(expectedOutput.toString()));
        }

        {
            //Question 4 test
            Question4 question4 = new Question4();
            // replace System.out.println with assert
            System.out.println(question4.factorial(5) == 120);
        }

        {
            //Question 5 test
            Question5 question5 = new Question5();
            String input = "Revature";
            // replace System.out.println with assert
            System.out.println(question5.subString(input, 4).toString().equals(input.substring(0, 3).toString()));
        }

        {
            //Question 6 test
            Question6 question6 = new Question6();
            int input = 5;
            System.out.println(question6.isEven(input) == false);
        }



    }
}
