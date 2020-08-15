package com.revature;

import java.util.Scanner;

public class Question16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your phrase: ");
        String str = input.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Count: " + count);

    }
}
//    for(int 1 = 0; i < str[0].length; i++) {
//        stringCount++;
//    }
//}
