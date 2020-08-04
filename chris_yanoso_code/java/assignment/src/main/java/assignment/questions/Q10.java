package assignment.questions;

public class Q10 {
    public int findMin(int n1, int n2){
        //a fast if statement comparing two numbers and returning which one is less
        int max = n1 <= n2 ? n1 : n2;
        return max;
    }
}
