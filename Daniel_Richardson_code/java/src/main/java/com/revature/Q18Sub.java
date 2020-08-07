package com.revature;

public class Q18Sub extends Q18{

    String example = "15 Reasons Why Nick Saban is a LAME and BORING coach.";
    //you won't BELIEVE number 5
    boolean containsUpper = false; //default

    public boolean upperCaseCheck(){
        for ( char element: example.toCharArray()) { //spread into c array
            if(Character.isUpperCase(element)==true){ //checking each character for an uppercase
                containsUpper = true;
            }
        }
        return containsUpper;
    }
    public String forceUpperCase(){
        return example.toUpperCase();
    }
    public Integer stringToInt(){

        example = example.replaceAll("[^\\d]", "");
        //had to use stackoverflow for this
        //using regular expression (regex) to pull out non-digits and decimals/periods
        //just so that parseint wouldn't freak out
        System.out.println(example);
        return Integer.parseInt(example)+10;

    }
}
