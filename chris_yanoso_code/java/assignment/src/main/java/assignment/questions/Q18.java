package assignment.questions;

import assignment.questions.question18.Q18SuperClass;

public class Q18 extends Q18SuperClass {

    @Override
    public boolean checkForUpperCase(String str) {
        boolean upperCase = false;
        char[] strChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strChar[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(strChar[i]) == true){
                upperCase = true;
                break;
            }
        }
        return upperCase;
    }

    @Override
    public String stringToUpperCase(String str) {
        str = str.toUpperCase();
        return str;
    }

    @Override
    public int stringToInt(String str) {
        char[] strChar = new char[str.length()];
        int stringInt = 0;
        for (int i = 0; i < str.length(); i++) {
            strChar[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            int temp = strChar[i];
            stringInt += temp;
        }
        stringInt += 10;
        return  stringInt;
    }
}
