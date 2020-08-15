package com.revature;

import static com.revature.AppDriver.defaults;

public class Q18Sub extends Q18{




    public Q18Sub(){
        String example = "15 Reasons Why Nick Saban is a LAME and BORING coach.";
        //you won't BELIEVE number 5
        boolean containsUpper = false; //default
        if(!defaults){
            InputHandler input = InputHandler.getInstance();
            System.out.println("Requires multi-word phrase that includes ints.");
            example = input.strInput();
        }
        containsUpper = upperCaseCheck(example);
        System.out.println("Contains an upper case? " + containsUpper);
        example = forceUpperCase(example);
        System.out.println("Forced Upper Case: ");
        System.out.println(example);
        int pulled = stringToInt(example);
        System.out.println("Retrieved ints + 10: " + pulled);

    }

    public boolean upperCaseCheck(String str){
        boolean flag = false;
        for ( char element: str.toCharArray()) { //spread into c array
            if(Character.isUpperCase(element)){ //checking each character for an uppercase
                flag = true;
            }
        }
        return flag;
    }
    public String forceUpperCase(String str){
        return str.toUpperCase();
    }
    public Integer stringToInt(String str){
        str = str.replaceAll("[^\\d]", "");
        return Integer.parseInt(str)+10;
        //had to use stackoverflow for this
        //using regular expression (regex) to pull out non-digits and decimals/periods
        //just so that parseInt wouldn't freak out
    }
}
