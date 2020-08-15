package com.revature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question14 {
    public static void main(String[] args) {

        int num;
        for(num = 0; num <= 3; num++){
            switch(num) {

                case 1:
                    System.out.println(Math.sqrt(9));
                    break;

                case 2:
                    LocalDate today = LocalDate.now();
                    System.out.println(today);
                    break;
                case 3:
                    String str = "I am learning: Core Java";
                    String[] arrStr = str.split(":");
                    for (String a: arrStr) {
                        System.out.println(a);
                    }
                    break;

            }
        }



    }

}
