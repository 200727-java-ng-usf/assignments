import com.revature.questions.*;
import com.revature.testHelpers.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Random;

import static java.time.LocalDateTime.*;
import static org.junit.Assert.*;

public class AssignmentTesting {

    //region INITIALIZERS
    Q1BubbleSort q1 = new Q1BubbleSort();
    Q2Fibonacci q2 = new Q2Fibonacci();
    Q3StringReversal q3 = new Q3StringReversal();
    Q4Factorial q4 = new Q4Factorial();
    Q5SubString q5 = new Q5SubString();
    Q6EvenInt q6 = new Q6EvenInt();
    Q7SortBy q7 = new Q7SortBy();
    Q8Palindrome q8 = new Q8Palindrome();
    Q9PrimeNumber q9 = new Q9PrimeNumber();
    Q10Ternary q10 = new Q10Ternary();
    Q11PackageAccess q11 = new Q11PackageAccess();
    Q12EnhancedFor q12 = new Q12EnhancedFor(5);
    Q13TrianglePrint q13 = new Q13TrianglePrint();
    Q14SwitchCases q14 = new Q14SwitchCases();
    Q15MathInterface q15 = new Q15MathInterface();
    Q16NumChars q16 = new Q16NumChars();
    Q17PrincipalInvesting q17 = new Q17PrincipalInvesting();
    Q18StringSubClasses q18 = new Q18StringSubClasses();
    Q19ArrayListOperations q19 = new Q19ArrayListOperations();
    Q20DataBaseParsing q20 = new Q20DataBaseParsing();
    //endregion

    //region HELPER_FUNCTIONS
    @After
    public void SeparateAfter(){
        System.out.println();
    }

    @Before
    public void SeparateBefore(){
        System.out.println();
    }

    public static void printValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
    //endregion

    @Test
    public void t1BubbleSort(){
        int[] bubbles = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
//        Collections.shuffle(bubbles);
        q1.BubbleSort(bubbles);
        printValues(bubbles);
        assertArrayEquals(new int[]{0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9}, bubbles);
    }
    @Test
    public void t2Fibonacci(){
        int len = 25;
        int[] fib = new int[len];
        q2.fibonacci(fib, len);
        printValues(fib);
        System.out.println();
        assertArrayEquals(new int[]{
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
                1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368},
                fib);
    }
    //TODO String Reversal
    @Test
    public void t3ReverseString()
    {
        String str = "ReverseMe";
//        str = q3.reverseBuild(str);
        str = q3.reverseString(str);
        System.out.println(str);
        assertEquals("eMesreveR", str);
    }
    @Test
    public void t4Factorial(){
        int n = 11;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = q4.Factorial(i);
            System.out.print(ar[i]);
            if (i < n) {
                System.out.print(", ");
            }
        }
        assertArrayEquals(new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800}, ar);
    }

    @Test
    public void t5SubString(){
        int index = 3;
        String str = "Revature";
        String ret = q5.substr(str, index);
        assertEquals("Rev", ret);
        System.out.println(str + " substring " + index + ": " + ret);
    }

    @Test
    public void t6EvenInt(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + q6.isEven(i));
        }
        Random rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        int x = rand.nextInt();
        assertEquals((x%2==0), q6.isEven(x));
        System.out.println(x + ": " + q6.isEven(x));
    }

    @Test
    public void t7SortBy(){
        int index = 2;
        Employee[] people = new Employee[index];
        people[0] = new Employee("Jim", "Parks", "DEV", 32);
        people[1] = new Employee("Timothy", "Parker", "DEV", 30);
        q7.EmployeeSort(people);
        System.out.println(people[0]);
        System.out.println(people[1]);
        assertArrayEquals(new Object[]{
                new Employee("Jim", "Parks", "DEV", 32),
                new Employee("Timothy", "Parker", "DEV", 30)},
                people);
    }

    @Test
    public void t8ArrayList(){
//        q8
        String[] words = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
        q8.sortAndStore(words);
        assertArrayEquals(words, q8.getAllStr().toArray());
    }

    @Test
    public void t8Palindrome(){
//        q8
        String[] words = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
        String[] pals = {"madam", "civic", "radar", "kayak", "refer", "did"};
        q8.sortAndStore(words);
        assertArrayEquals(pals, q8.getPalindromes().toArray());
    }

    @Test
    public void t9PrimeNumber(){
        Integer[] primesToHundred = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,};
        q9.printPrimes();
        assertArrayEquals(primesToHundred, q9.getPrimesToHundred().toArray());
    }

    @Test
    public void t10Ternary(){
        Random rand = new Random();
        rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
        int x = rand.nextInt();
        int y = rand.nextInt();
        System.out.println(x + " " + y + ": " + q10.lesser(x, y));
        assertEquals((x < y ? x : y), q10.lesser(x, y));
    }

    @Test
    public void t11PackageAccess(){
//        q11
    }
}
