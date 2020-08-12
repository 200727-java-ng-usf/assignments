package assignment.questions;

public class Q13 {
    public void trianglePrint(int b) {
        //using b to denote how big the triangle needs to be
        for (int i = 1; i < b +1; i++){
            //will loop from i down to 1
            int j = i;
            while (j > 0){
                //prints 0 or 1 if even or odd
                if (j % 2 == 0) {
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                j--;
            }
            //adds new line
            System.out.print("\n");

        }
    }
}
