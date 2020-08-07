package com.revature.questions;

public class Q13TrianglePrint {
//    Q13. Display the triangle on the console as follows using any type of loop.
//    Do NOT use a simple group of print statements to accomplish this.
//            0
//            1 0
//            1 0 1
//            0 1 0 1

    /*
        a = 0; b = 1;

        concat 0 to the end
        prepend 1 to the beginning
        swap (a, b)
    */

    /*
        Alternating 1s and 0s

     */
    private int i = 0;
    private String str = "";
    private String[] ret;

    private String a = "0";
    private String b = "1";

//    private String strPrepend(String str, String ins) {
//        return ins + str;
//    }

    private void swap(){
        String temp = a;
        a=b;
        b=temp;
    }

    public String[] triWhile(int end) {
        i = 0;
        ret = new String[end];
        while (i < end) {
            if (i % 2 == 0) {
                str = str.concat(a);
            } else {
                str = b.concat(str);
                swap();
            }
            ret[i] = str;
            i++;
        }
        return ret;
    }

    public static void printStr(String str) {
        for (int j = 0; j < str.length(); j++) {
            System.out.print(str.charAt(j));
            if (j < str.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

//    public String triDoWhile(){
//        return str;
//    }
//    public String triFor(){
//
//    }
//    public String triEnhancedFor(){
//
//    }
//    public String triRecursive(){
//
//    }

//    private String triTailRecursiveGo(){
//
//    }
//    public String triTailRecursive(){
//
//    }
}
