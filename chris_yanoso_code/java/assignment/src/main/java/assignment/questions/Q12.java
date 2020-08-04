package assignment.questions;

import java.util.ArrayList;

public class Q12 extends Q6 {
    public void even100(){
        ArrayList<Integer> oneHundred = new ArrayList<>(100);
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        //fills array from 1-100
        for(Integer i = 1; i < 101; i ++){
            oneHundred.add(i);
        }
        for(Integer n: oneHundred){
           if (isEven(n)){
               evenNumbers.add(n);
           }
        }
        for(Integer m: evenNumbers){
            System.out.print(m + ",");
        }
        System.out.println("");
    }
}
