package mainpackage;

public interface Arithmetic {
    float firstNumber = 0;
    // This is initialized to one so that it will not default to division by zero
    float secondNumber = 1;

    // These are implemented in ArithmeticImpl
    float addUp();
    float subtractIt();
    float multiplyIt();
    float divideBy();
}
