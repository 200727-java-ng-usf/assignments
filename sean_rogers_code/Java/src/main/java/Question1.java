import java.util.Arrays;

/**
 * Question1 is dedicated to bubble sorting. It has one method that takes an integer array,
 * sorts it using the bubbles sort algorithm, then displays it to the console and returns it.
 * The original integer array is sorted. It is not copied.
 */
public class Question1 {

    public int[] bubbleSort(int[] ar) {
        int temp;
        for(int i = 1; i < ar.length; i++) {
            for(int j = 1; j < ar.length; j++) {
                if(ar[j] < ar[j - 1]) {
                    temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
            }
        }
        System.out.println("Bubble sorted: " + Arrays.toString(ar));
        return ar;
    }
}
