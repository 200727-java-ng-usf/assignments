package com.revature.question15;

public class Question15 implements MathInterface{

    public static void main(String[] args) {
        int sum = MathInterface.add(2, 6);
        System.out.println(sum);
        System.out.println("----------");
        int difference = MathInterface.sub(2, 6);
        System.out.println(difference);
        System.out.println("----------");
        int product = MathInterface.mul(2, 6);
        System.out.println(product);
        System.out.println("----------");
        int factor = MathInterface.div(6, 6);
        System.out.println(factor);
        System.out.println("----------");

    }

}
