package assignment.questions;

public class Q5 {

    public void partOfString(String str, int idx){
        //custom string
        //String str = "random";
        //custom index
        //int idx = 4;
        //prints out each character from 0 to idx
        for (int i = 0; i < idx + 1; i++){
            char c = str.charAt(i);
            //no ln so all elements print out on same line, looks like a single string
            System.out.print(c);
        }
    }
}
