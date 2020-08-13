package com.revature.coreJavaAssign;

public class q18Subclass extends q18AbstractSuper{

    public q18Subclass(String thisString){
        this.thisString = thisString;
    }


    //All of the abstract methods from the superclass
    @Override
    boolean upperCase() {
        //will check if there are upper cases inside of the string

        String lowerCase = thisString.toLowerCase();
        //if lowerCase is the same to thisSring that means that there is no upper cases inside the string
        //
        boolean sameCase = lowerCase.equals(thisString);
        if(sameCase) {
            //if sameCase is true there is no upper cases inside thisString
            return false;
        }else{
            //if sameCase is false then there is upp cases inside thisString
            return true;
        }
    }

    @Override
    String convertToUpper() {
        //this method will return  thisString but in all UPPERCASE
        String upperCase = thisString.toUpperCase();
        return upperCase;
    }

    @Override
    int convertToInt() {
        //convert a string into a int then add 10
        //this will iterate the length of the string
        int intConvert = 0;
        for(int i=0;i<thisString.length();i++) {
            //will turn the string will into char and make it an int and will get the sum
             intConvert = intConvert + (int)thisString.charAt(i);
        }
        //here i add the ten
        intConvert = intConvert + 10;
        return intConvert;
    }
}
