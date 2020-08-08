package com.revature;

public class QuestionThirteen {

    public static void main(String[] args) {

        int a, b, x;
        a = 0;
        b = 1;
        x=  0;

        do{
            System.out.println(a +"");
            x++;
        }while(x < 1 ) ;
        do {
            System.out.println( b+" "+a);
            x++;
        }while(x <2);
        do {
            System.out.println( b+" "+a+" "+b);
            x++;
        }while(x <3);
        do {
            System.out.println( a+" "+b+" "+a+" "+b);
            x++;
        }while(x <4);

    }
}
