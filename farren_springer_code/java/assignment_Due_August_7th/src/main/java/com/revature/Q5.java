package com.revature;

public class Q5 {

    static void concatIt(String str, int idx) {
        System.out.println("String Entered: " + str);
        System.out.println("Integer entered: " + idx);
        for(int i = 0; i < idx; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        concatIt("what's up", 3);

        // take in a value from the scanner

    }
}