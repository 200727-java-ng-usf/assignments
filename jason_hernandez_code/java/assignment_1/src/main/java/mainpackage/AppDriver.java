package mainpackage;

public class AppDriver {
    public static void main(String[] args) {
        BubbleSort bubbleSort() {
            System.out.println("1. Bubble Sort and array");
            System.out.println("Array Before Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            bubbleSort(arr);//sorting array elements using bubble sort

            System.out.println("Array After Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("+------------------------+");
        }
        Fibonacci fibonacci();
        ReverseString reverseString();
        Nfactorial nfactorial();
        SubStringerMethod subStringerMethod();
        IntEven intEven();
        EmployeeSort employeeSort();
        Palindromes palindromes();
        PrimeNumbers primeNumbers();
        FindMinimum findMinimum();
        PackageFloat packageFloat();
        Evens evens();
        Triangle triangle();
        SwitchDemo switchDemo();
        ArithmeticImpl arithmetic();
        NumberOfCharacters numberOfCharacters();
        InterestCalculator interestCalculator();
        ChangeCase changeCase();
        AddUpArrayList addUpArrayList();
        NotePadReader notePadReader();
    }
}
