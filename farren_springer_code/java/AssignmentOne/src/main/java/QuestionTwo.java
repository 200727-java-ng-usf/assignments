public class QuestionTwo {

    public static void main(String[] args) {
        // specify the number of iterations.
        int numberOfNumbers = 25;
        // initialize the first two numbers in the sequence.
        int now = 1;
        int then = 0;
        // print the first two numbers.
        System.out.print(then);
        System.out.print(", " + now);
        // initialize a new variable that the then variable can be stored in.
        int thenthen;
        // parse through and add the previous two numbers in the sequence.
        for(int i = 2; i < numberOfNumbers; i++) {
            thenthen = then;
            then = now;
            now = thenthen + then;
            System.out.print(", " + now);
        }
    }

} // done
