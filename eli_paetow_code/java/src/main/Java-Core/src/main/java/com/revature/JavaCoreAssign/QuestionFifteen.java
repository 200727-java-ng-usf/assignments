package com.revature.JavaCoreAssign;
//Write a program that defines an interface having the following methods:
// addition, subtraction, multiplication, and division.  Create a class that
// implements this interface and provides appropriate functionality to carry out the required operations.

public class QuestionFifteen implements Question15Interface{

    private int num;
    private int num2;


    public QuestionFifteen(int num1, int num2) {
        this.num = num;
        this.num2 = num2;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num1) {
        this.num = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }



    @Override
    public int addition(int num, int num2) {
        return num + num2;
    }

    @Override
    public int subtract(int num, int num2) {
        return num - num2;
    }

    @Override
    public int multiplication(int num, int num2) {
        return num * num2;
    }

    @Override
    public int divide(int num, int num2) {
        return num / num2;
    }
}
