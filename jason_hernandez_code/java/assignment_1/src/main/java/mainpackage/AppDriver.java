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
        intEven.determineIfEven(5f);
        System.out.println("+------------------------+");

        System.out.println("7. Sort employees by name, department, and age");
        EmployeeSort employeeSort = new EmployeeSort();
        employeeSort.sortEmployee("", "", 0);
        System.out.println("+------------------------+");

        System.out.println("8. Extract palindromes from an array list");
        Palindromes palindromes = new Palindromes();
        palindromes.checkForPalindromes();
        System.out.println("+------------------------+");

        System.out.println("9. Print out prime numbers");
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.isPrime();
        System.out.println("+------------------------+");

        System.out.println("10. Find the minimum of two numbers");
        FindMinimum findMinimum = new FindMinimum();
        findMinimum.findTheMinimum(0, 0);
        System.out.println("+------------------------+");

        System.out.println("11. Access another package");
        PackageFloat packageFloat = new PackageFloat();
        packageFloat.storeFloat();
        System.out.println("+------------------------+");

        System.out.println("12. Print even numbers");
        Evens evens = new Evens();
        evens.getEvens();
        System.out.println("+------------------------+");

        System.out.println("13. Generate triangle using loop");
        Triangle triangle = new Triangle();
        triangle.createTriangle();
        System.out.println("+------------------------+");

        System.out.println("14. Demonstrate the switch case");
        SwitchDemo switchDemo = new SwitchDemo();
        switchDemo.buildSwitchDemo("");
        System.out.println("+------------------------+");

        System.out.println("15. Implement an interface");
        ArithmeticImpl arithmetic = new ArithmeticImpl();
        arithmetic.implementArithmetic();
        System.out.println("+------------------------+");

        System.out.println("16. Count number of characters in a string");
        NumberOfCharacters numberOfCharacters = new NumberOfCharacters();
        numberOfCharacters.count("");
        System.out.println("+------------------------+");

        System.out.println("17. Calculate principal, rate, and time");
        InterestCalculator interestCalculator = new InterestCalculator();
        interestCalculator.calculateTheInterest();
        System.out.println("+------------------------+");

        System.out.println("18. Change the case of characters using subclass");
        SubChangeCase changeCase = new SubChangeCase();
        changeCase.checkForUppercase();
        changeCase.convertToUppercase();
        changeCase.convertToIntPlusTen();
        System.out.println("+------------------------+");

        System.out.println("19. From array list, add up evens and add up odds, remove prime numbers");
        AddUpArrayList addUpArrayList = new AddUpArrayList();
        addUpArrayList.addUpArraylist();
        System.out.println("+------------------------+");

        System.out.println("20. Read from NotePad");
        NotePadReader notePadReader = new NotePadReader();
        notePadReader.readFromNotePad();
    }
}
