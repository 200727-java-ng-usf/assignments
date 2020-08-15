package mainpackage;

import mainpackage.comparators.EmployeeSortByAge;
import mainpackage.comparators.EmployeeSortByDepartment;
import mainpackage.comparators.EmployeeSortByName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AppDriver {
    public static void main(String[] args) {
        System.out.println("1. Bubble Sort an array");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort();
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
        nfactorial.nFactorial();

        System.out.println("+------------------------+");

        System.out.println("5. Return a substring within ints");
        SubStringerMethod subStringerMethod = new SubStringerMethod();
        subStringerMethod.subStringerMethod();
        System.out.println("+------------------------+");

        System.out.println("6. Determine if int is even without using modulo");
        IntEven intEven = new IntEven();
        System.out.println("Number to check: 5");
        intEven.determineIfEven(5f);
        System.out.println("+------------------------+");

        System.out.println("7. Sort employees by name, department, and age");
        ArrayList<EmployeeSort> list = new ArrayList<>();
        //Populate list with employees
        list.add(new EmployeeSort("Pikup Andropov", "Shipping", 27));
        list.add(new EmployeeSort("Allison Wonderland", "R and D", 35));
        System.out.println("Unsorted");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        // Sort by name
        Collections.sort(list, new EmployeeSortByName());
        System.out.println("\nSorted by name");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        // Sort by Department
        Collections.sort(list, new EmployeeSortByDepartment());
        System.out.println("\nSorted by department");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        // Sort by Age
        Collections.sort(list, new EmployeeSortByAge());
        System.out.println("\nSorted by age");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
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
        findMinimum.findTheMinimum(8, 5);
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
        switchDemo.buildSwitchDemo("sqrt");
        switchDemo.buildSwitchDemo("date");
        switchDemo.buildSwitchDemo("split");
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
        changeCase.stringToCheck = "Foxes";
        changeCase.checkForUppercase();
        changeCase.convertToUppercase();
        //changeCase.convertToIntPlusTen();
        System.out.println("+------------------------+");

        System.out.println("19. From array list, add up evens and add up odds, remove prime numbers");
        AddUpArrayList addArrayList = new AddUpArrayList();
        addArrayList.addUpArraylist();
        System.out.println("+------------------------+");

        System.out.println("20. Read from NotePad");
        NotePadReader notePadReader = new NotePadReader();
        notePadReader.readFromNotePad();
    }
}
