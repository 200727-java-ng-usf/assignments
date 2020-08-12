package com.revature;
import java.util.ArrayList;
import java.util.List;

public class QuestionNineteen {

    static public int sumOfEvenNumbers(List<Integer> x){

        int sum = 0;

        for (int i = x.indexOf(0) ; i <= x.size(); i++){
            if(x.indexOf(i) % 2 == 0){
                sum+=i;
            }
        }
        return sum;
    }

    static public int sumOfOddNumbers(List<Integer> x){

        int sum = 0;

        for (int i = x.indexOf(0) ; i <= x.size(); i++){
            if(x.indexOf(i) % 2 != 0){
                sum+=i;
            }
        }
        return sum;
    }

    static public boolean checkIfPrime(List<Integer> num){
        for (int x = 2; x < (int)Math.sqrt(num.indexOf(x)); x++)
            if (num.indexOf(x) % x == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        int num = 0;

        for (int i = 0 ; i <= 10 ; i++){
            numbers.add(num++);
        }

        System.out.println(numbers);

        System.out.println("Here are your even numbers total "+ sumOfEvenNumbers(numbers));

        System.out.println("Here are your odd numbers total "+ sumOfOddNumbers(numbers));

        if (checkIfPrime(numbers)){

            numbers.remove(numbers);
            System.out.println(numbers);

        }




        }
}
