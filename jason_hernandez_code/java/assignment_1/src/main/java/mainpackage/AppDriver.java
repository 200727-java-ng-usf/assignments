package mainpackage;

import java.util.Arrays;

public class AppDriver {
    public static void main(String[] args) {
        System.out.println("1. Bubble Sort an array");
        System.out.println("Array Before Bubble Sort");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort();

        System.out.println("Array After Bubble Sort");
        System.out.println(bubbleSort);

        System.out.println("+------------------------+");

        System.out.println("2. Generate Fibonacci series");
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(Arrays.toString(fibonacci.getFibonacciArray()));
        System.out.println("+------------------------+");

        System.out.println("3. Reverse a string without using .reverse");
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString();

        System.out.println("+------------------------+");

        System.out.println("4. Calculate N-factorial");
        Nfactorial nfactorial = new Nfactorial();

        System.out.println("+------------------------+");

        System.out.println("5. Return a substring within ints");
        SubStringerMethod subStringerMethod = new SubStringerMethod();

        System.out.println("+------------------------+");

        System.out.println("6. Determine if int is even without using modulo");
        IntEven intEven = new IntEven();

        System.out.println("+------------------------+");

        System.out.println("7. Sort employees by name, department, and age");
        EmployeeSort employeeSort = new EmployeeSort();

        System.out.println("+------------------------+");

        System.out.println("8. Extract palindromes from an array list");
        Palindromes palindromes = new Palindromes();

        System.out.println("+------------------------+");

        System.out.println("9. Print out prime numbers");
        PrimeNumbers primeNumbers = new PrimeNumbers();

        System.out.println("+------------------------+");

        System.out.println("10. Find the minimum of two numbers");
        FindMinimum findMinimum = new FindMinimum();

        System.out.println("+------------------------+");

        System.out.println("11. Access another package");
        PackageFloat packageFloat = new PackageFloat();

        System.out.println("+------------------------+");

        System.out.println("12. Print even numbers");
        Evens evens = new Evens();

        System.out.println("+------------------------+");

        System.out.println("13. Generate triangle using loop");
        Triangle triangle = new Triangle();


        System.out.println("+------------------------+");

        System.out.println("14. Demonstrate the switch case");
        SwitchDemo switchDemo = new SwitchDemo();

        System.out.println("+------------------------+");

        System.out.println("15. Implement an interface");
        ArithmeticImpl arithmetic = new ArithmeticImpl();

        System.out.println("+------------------------+");

        System.out.println("16. Count number of characters in a string");
        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();

        System.out.println("+------------------------+");

        System.out.println("17. Calculate principal, rate, and time");
        InterestCalculator interestCalculator = new InterestCalculator();

        System.out.println("+------------------------+");

        System.out.println("18. Change the case of characters");
        ChangeCase changeCase = new ChangeCase();

        System.out.println("+------------------------+");

        System.out.println("19. From array list, add up evens and add up odds, remove prime numbers");
        AddUpArrayList addUpArrayList = new AddUpArrayList();

        System.out.println("+------------------------+");

        System.out.println("20. Read from NotePad");
        NotePadReader notePadReader = new NotePadReader();

    }
}
