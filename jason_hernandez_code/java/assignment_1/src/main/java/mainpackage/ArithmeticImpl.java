package mainpackage;

import java.util.Scanner;

public class ArithmeticImpl implements Arithmetic {


        Scanner firstNum = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number ");
        float firstNumber = firstNum.nextFloat();  // Read user input

        Scanner secNum = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number ");
        float secondNumber = secNum.nextFloat();  // Read user input

        @Override
        public void addUp() {
            float sumUp = firstNumber + secondNumber;
            System.out.println("Sum: " + sumUp);
        }

        @Override
        public void subtract () {
            float diff = firstNumber - secondNumber;
            System.out.println("Difference: " + diff);
        }

        @Override
        public void multiply () {
            float mult = firstNumber * secondNumber;
            System.out.println("Product: " + mult);
        }

        @Override
        public void divideBy () {
            float quotient = firstNumber / secondNumber;
            System.out.println("Quotient: " + quotient);
        }

    public Scanner getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Scanner firstNum) {
        this.firstNum = firstNum;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Scanner getSecNum() {
        return secNum;
    }

    public void setSecNum(Scanner secNum) {
        this.secNum = secNum;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }
}
