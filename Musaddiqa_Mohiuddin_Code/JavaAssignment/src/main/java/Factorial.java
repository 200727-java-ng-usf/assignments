public class Factorial {
    // method to find factorial of given number 
    private int factorialValue;
    
    public int getFactorialValue() {
    	return factorialValue;
    }
	private int factorial(int n)
    {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    // Driver method 
    public void main(Integer num)
    {
    	factorialValue = factorial(num);
    	System.out.println("Factorial of "+ num + " is " + factorialValue);
    }
} 