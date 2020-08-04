package assignment.questions;

public class Q6 {

    public boolean isEven (int n) {
        // divides number by 2 and re multiplies it by 2
        int newN = n /2;
        newN *=2;
        //int will not use .5 so if the new number is equal to the original than there was no .5 involved and then number is even
        if (newN == n){
            return true;
        } else {
            return false;
        }
    }
}
