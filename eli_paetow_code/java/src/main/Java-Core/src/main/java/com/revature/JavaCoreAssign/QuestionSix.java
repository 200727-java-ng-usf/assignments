package com.revature.JavaCoreAssign;

//Q6. Write a program to determine if an integer is even without using the modulus operator (%)
public class QuestionSix {

    static boolean numIsEven(int num){

        //take the number passsed from test class
        //divide by 2 then * 2
        // 10/2 = 5. 5*2 = 10. 10 = even
        return ((num /2 ) * 2 ==num);


    }

}
