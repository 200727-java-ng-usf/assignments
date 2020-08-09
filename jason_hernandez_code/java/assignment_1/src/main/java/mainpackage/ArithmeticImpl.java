package mainpackage;

public class ArithmeticImpl implements Arithmetic {

    float implementArithmetic() {
        float firstNumber;
        float secondNumber;

        public float getFirstNumber () {
        return firstNumber;
    }

        public void setFirstNumber (firstNumber){
        this.firstNumber = firstNumber;
    }

        public float getSecondNumber () {
        return secondNumber;
    }

        public void setSecondNumber (secondNumber) {
                this.secondNumber = secondNumber;
    }
    }

    @Override
    public void addUp() {
        float sum = firstNumber + secondNumber;
    }

    @Override
    public void subtractIt() {
        float difference = firstNumber - secondNumber;
    }

    @Override
    public void multiplyIt() {
        float product = firstNumber * secondNumber;
    }

    @Override
    public void divideBy() {
        float quotient = firstNumber / secondNumber;
    }


}

