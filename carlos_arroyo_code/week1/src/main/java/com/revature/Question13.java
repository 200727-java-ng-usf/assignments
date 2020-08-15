package com.revature;

public class Question13 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 0; j < i; j++) {
//                if (i == 1) {
//                    System.out.println("0");
//                } else if (i == 2) {
//                    System.out.println("10");
//                }else if (i == 3 && j == 2) {
//                    System.out.println("101");
//                }else{
//                    System.out.println("0101");
//                }
//            }
//        }

        int i = 0;
        while (i <= 4) {
            if (i == 0) {
                System.out.println("0");
            } else if (i == 2) {
                System.out.println("10");
            } else if (i == 3) {
                System.out.println("101");
            } else if (i == 4){
                System.out.println("0101");
            }
            i++;
        }
    }
}
