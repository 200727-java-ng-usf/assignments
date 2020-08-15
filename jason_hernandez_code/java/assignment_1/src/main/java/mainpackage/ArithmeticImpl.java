package mainpackage;

public class ArithmeticImpl implements Arithmetic {

    // Declare variables
    float firstNumber;
    float secondNumber;

    void implementArithmetic() {

    }

    // Each of these overrides the corresponding one in Arithmetic interface
    @Override
    public float addUp() {
        float sum = firstNumber + secondNumber;
        System.out.println(sum);
        return sum;
    }

    @Override
    public float subtractIt() {
        float difference = firstNumber - secondNumber;
        System.out.println(difference);
        return difference;
    }

    @Override
    public float multiplyIt() {
        float product = firstNumber * secondNumber;
        System.out.println(product);
        return product;
    }

    @Override
    public float divideBy() {
        float quotient = firstNumber / secondNumber;
        System.out.println(quotient);
        return quotient;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }
}

