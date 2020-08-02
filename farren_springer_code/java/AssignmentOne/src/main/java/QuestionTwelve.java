import java.util.Arrays;

public class QuestionTwelve {
    public static void main(String[] args) {

        // initialize the array size
        int[] hundredArray = new int[100];

        System.out.println(Arrays.toString(hundredArray)); // test

        // store 1 through 100 in the array
        for(int i = 1; i < 101; i++) {
            hundredArray[i-1] = i;
        }

        System.out.println(Arrays.toString(hundredArray)); // test

        // print the even numbers
        for(int i : hundredArray) {
            if(hundredArray[i]%2 == 0){
                System.out.print(hundredArray[i]);
            }
            else {
                System.out.print(" ");
            }
        } // error in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100

    }
}