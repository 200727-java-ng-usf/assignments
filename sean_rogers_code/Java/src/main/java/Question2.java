/**
 * Question2 is dedicated to creating the fibonacci sequence. It takes an input, then stores
 * a fibonacci sequence up to that input. For example, if 5 is the input, it will store 0 1 1 2 3
 * It's stored in a StringBuilder. Each number is separated by a space.
 *
 */
public class Question2 {
    public StringBuilder fibonacci(int x) {

        //stringBuilder will be returned
        StringBuilder stringBuilder = new StringBuilder("0 ");

        int previousNum = 0;
        int currentNum = 1;
        int temp;
        for(int i = 0; i < x; i++) {
            stringBuilder.append(currentNum + " ");
            temp = previousNum;
            previousNum = currentNum;
            currentNum += temp;
        }
        System.out.println("Fibonacci sequence: " + stringBuilder.toString());
        return stringBuilder;
    }
}
