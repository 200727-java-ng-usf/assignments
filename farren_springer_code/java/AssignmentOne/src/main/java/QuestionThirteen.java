public class QuestionThirteen {

    public static void main(String[] args) {
        System.out.println("Here is the series of 0s and 1s: ");
        int counter = 0;
        String theZero = "0";
        String theOne = "1";
        String result = " ";
        String newResult = "0";
        for (int i= 0; i < 4; i++) {
            System.out.println(newResult);
            if (i%2 == 0) {
                newResult += result.concat(theOne);
            } else {
                newResult += result.concat(theZero);
            }
        }
    }

} // not done. Not printing in the correct order.
