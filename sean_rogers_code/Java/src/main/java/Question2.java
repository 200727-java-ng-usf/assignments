public class Question2 {
    public StringBuilder fibonacci(int x) {
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
