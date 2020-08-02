package com.revature.Q15;

public class Calculator implements MyMath {
    public Calculator() {
    }

    @Override
    public int add(int operandLeft,int operandRight) {
        return  operandLeft+operandRight;
    }

    @Override
    public int sub(int operandLeft,int operandRight) {
        return operandLeft-operandRight;
    }

    @Override
    public int mul(int operandLeft,int operandRight) {
        return operandLeft*operandRight;
    }

    @Override
    public int div(int operandLeft,int operandRight) {
        if(operandRight==0){
            return 0;
        }else {
            return operandLeft / operandRight;
        }
    }
}
