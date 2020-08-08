package mainpackage;

import java.util.Arrays;
import java.util.List;

public class AppDriver {
    public static void main(String[] args) {
        System.out.println("1. Bubble Sort an array");
        System.out.println("Array Before Bubble Sort");
        BubbleSort bubbleSort = new BubbleSort();

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
        subStringerMethod.subStringerMethod();
        System.out.println("+------------------------+");

        System.out.println("6. Determine if int is even without using modulo");
        IntEven intEven = new IntEven();
        intEven.intEven();
        System.out.println("+------------------------+");

        System.out.println("7. Sort employees by name, department, and age");
        EmployeeSort employeeSort = new EmployeeSort();
        employeeSort.employeeSort();
        System.out.println("+------------------------+");

        System.out.println("8. Extract palindromes from an array list");
        Palindromes palindromes = new Palindromes();
        palindromes.palindromes();
        System.out.println("+------------------------+");

        System.out.println("9. Print out prime numbers");
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.primeNumbers();
        System.out.println("+------------------------+");

//        System.out.println("10. Find the minimum of two numbers");
//        FindMinimum findMinimum = new FindMinimum();
//        findMinimum.findMinimum(new int11, 4);
//        System.out.println("+------------------------+");

        System.out.println("11. Access another package");
        PackageFloat packageFloat = new PackageFloat();
        packageFloat.packageFloat();
        System.out.println("+------------------------+");

        System.out.println("12. Print even numbers");
        Evens evens = new Evens();
        evens.evens();
        System.out.println("+------------------------+");

        System.out.println("13. Generate triangle using loop");
        Triangle triangle = new Triangle();
        triangle.triangle();
        System.out.println("+------------------------+");

        System.out.println("14. Demonstrate the switch case");
        SwitchDemo switchDemo = new SwitchDemo();
        switchDemo.switchDemo();
        System.out.println("+------------------------+");

        System.out.println("15. Implement an interface");
        ArithmeticImpl arithmetic = new ArithmeticImpl();
        arithmetic.arithmetic();
        System.out.println("+------------------------+");

        System.out.println("16. Count number of characters in a string");
        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();
        numberOfCharacters.numberOfCharacters();
        System.out.println("+------------------------+");

        System.out.println("17. Calculate principal, rate, and time");
        InterestCalculator interestCalculator = new InterestCalculator();
        interestCalculator.interestCalculator();
        System.out.println("+------------------------+");

        System.out.println("18. Change the case of characters");
        ChangeCase changeCase = new ChangeCase();
        changeCase.changeCase();
        System.out.println("+------------------------+");

        System.out.println("19. From array list, add up evens and add up odds, remove prime numbers");
        AddUpArrayList addUpArrayList = new AddUpArrayList();
        addUpArrayList.addUpArraylist();
        System.out.println("+------------------------+");

//        System.out.println("20. Read from NotePad");
//        NotePadReader notePadReader = new NotePadReader();
//        notePadReader.notePadReader();
    }
}
