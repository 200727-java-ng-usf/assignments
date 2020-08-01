import java.util.Arrays;

public class Question1 {

    public int[] bubbleSort(int[] ar) {
        int temp;
        for(int i = 1; i < ar.length - 1; i++) {
            for(int j = i; j < ar.length; j++) {
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
