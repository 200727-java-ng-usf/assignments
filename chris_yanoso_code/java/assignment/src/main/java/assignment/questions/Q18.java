package assignment.questions;

import assignment.questions.question18.Q18SuperClass;
//class extends an abstract superclass
public class Q18 extends Q18SuperClass {

    @Override
    //overrides abstract, method checks if string has an uppercase
    public boolean checkForUpperCase(String str) {
        boolean upperCase = false;
        char[] strChar = new char[str.length()];
        //changes string into a char array
        for (int i = 0; i < str.length(); i++) {
            strChar[i] = str.charAt(i);
        }
        //checks through char array for an uppercase
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(strChar[i]) == true){
                upperCase = true;
                //breaks out of loop if an uppercase is found, one is enough
                break;
            }
        }
        return upperCase;
    }

    @Override
    //method makes string all caps
    public String stringToUpperCase(String str) {
        str = str.toUpperCase();
        return str;
    }

    @Override
    //changing string to int values
    public int stringToInt(String str) {
        char[] strChar = new char[str.length()];
        int stringInt = 0;
        //converts string into chars in an array
        for (int i = 0; i < str.length(); i++) {
            strChar[i] = str.charAt(i);
        }
        //chars -> ints, adds ints
        for (int i = 0; i < str.length(); i++) {
            int temp = strChar[i];
            stringInt += temp;
        }
        //+10
        stringInt += 10;
        return  stringInt;
    }
}
