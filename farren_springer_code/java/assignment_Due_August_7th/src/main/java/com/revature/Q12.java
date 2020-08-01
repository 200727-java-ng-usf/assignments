import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[] hundredArray = new int[100];
        System.out.println(Arrays.toString(hundredArray));
        for(int i = 1; i < 101; i++) {
            hundredArray[i-1] = i;
        }
        System.out.println(Arrays.toString(hundredArray));

        // enhanced for loop to print even numbers

    }
}
