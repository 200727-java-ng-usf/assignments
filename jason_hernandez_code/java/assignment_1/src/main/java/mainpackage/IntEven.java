package mainpackage;

public class IntEven {

    public boolean determineIfEven(float f) {
        // Divide the number by 2
        float quotient2 = f / 2f;

        // Then, check whether the quotient is an integer
        if (quotient2 == (int) quotient2) {
            System.out.println("The number is even");
            return true;
        } else {
            System.out.println("The number is odd");
            return false;
        }
    }
}


