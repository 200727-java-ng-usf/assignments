package mainpackage;

public class ArithmeticImpl implements Arithmetic {

    void implementArithmetic() {

    }

    // Each of these overrides the corresponding one in Arithmetic interface
    @Override
    public float addUp() {
        float sum = firstNumber + secondNumber;
        return sum;
    }

    @Override
    public float subtractIt() {
        float difference = firstNumber - secondNumber;
        return difference;
    }

    @Override
    public float multiplyIt() {
        float product = firstNumber * secondNumber;
        return product;
    }

    @Override
    public float divideBy() {
        float quotient = firstNumber / secondNumber;
        return quotient;
    }


}

