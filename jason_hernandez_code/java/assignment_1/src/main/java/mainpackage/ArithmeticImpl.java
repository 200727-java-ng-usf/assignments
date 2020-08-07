package mainpackage;

public class ArithmeticImpl implements Arithmetic {
    float firstNumber;
    float secondNumber;

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

    @Override
    public void addUp() {
        return firstNumber + secondNumber;
    }
    @Override
    public double subtractIt() {
        return firstNumber - secondNumber;
    }
    @Override
    public double multiplyIt() {
        return firstNumber * secondNumber;
    }

    @Override
    public double divideBy() {
        return firstNumber / secondNumber;
    }

}

