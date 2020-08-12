package assignment.questions;

import java.util.ArrayList;

public class Q12 extends Q6 {
    //extends q6 to get is even method
    public void even100(){
        ArrayList<Integer> oneHundred = new ArrayList<>(100);
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        //fills array from 1-100
        for(Integer i = 1; i < 101; i ++){
            oneHundred.add(i);
        }
        //for each loop  to test for even numbers
        for(Integer n: oneHundred){
                if (isEven(n)){
                    evenNumbers.add(n);
                }
        }
        for(Integer m: evenNumbers){
            System.out.print(m + ",");
        }
    }
}
