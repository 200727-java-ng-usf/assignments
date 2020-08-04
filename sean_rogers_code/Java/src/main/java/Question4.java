/**
 * Question4 is dedicated to calculating the factorial of input x
 * x holds an integer value and is iterated
 */
public class Question4 {
    public int factorial(int x) {
        int total = 1;
        for(int i = x; i > 0; i--) {
            total *= i;
        }
        System.out.println(x + "! = " + total);
        return total;
    }
}
