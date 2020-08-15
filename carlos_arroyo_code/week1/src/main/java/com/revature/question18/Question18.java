package com.revature.question18;

public class Question18 extends AbstractClass {


    public static void main(String[] args) {
        AbstractClass obj = new Question18();
        System.out.println(obj.isStringUpperCase("Hello"));
        System.out.println(obj.stringToLowerCase("HELLO"));
        System.out.println(obj.covertToInteger("100"));
    }

    boolean isStringUpperCase(String str) {


        char[] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length; i++) {

            if (!Character.isUpperCase(charArray[i])) {
                return false;
            }
        }
        return true;

    }

    String stringToLowerCase(String str) {
        str.toLowerCase();
        return str;
    }

    int covertToInteger(String str) {
        int num = Integer.parseInt(str);
        num = num + 10;
        return num;
    }
}
