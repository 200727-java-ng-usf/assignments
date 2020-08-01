package com.revature;

import java.util.ArrayList;

public class Q8 {
    public void showArrayList() {
        ArrayList<String> names = new ArrayList<String>();


        System.out.println("“karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”\n");
        //pass the strings in the array , easy to add in ArrayList by loop
        String[] nameArray = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john",  "refer", "billy", "did"};
        for(int i =0;i<nameArray.length;i++){
            names.add(nameArray[i]);
        }
        System.out.println("ArrayList Print names : ");

        System.out.print(names.toString());

        ArrayList<String> getNames = new ArrayList<String>(names);
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("Another ArrayList Print names : ");
        System.out.println(getNames.toString());


    }

}
