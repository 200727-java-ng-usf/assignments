import java.util.Calendar;
import java.util.Date;


/**
 * Question14 demonstrates the switch case. Implement the following
 * functionalities in the cases:java
 * Case 1: Find the square root of a number using the Math class method.
 * Case 2: Display today’s date.
 * Case 3: Split the following string and store it in a string array.
 * “I am learning Core Java”
 *
 *
 */
public class Question14 {

    /**
     *
     * @param num for the switch case
     * @param num2 for the sqrt method
     * @return returns the output retrieved from each test case
     */
    public String switchDemo(int num, int num2) {
        String strResult = "I am learning core java";
        String[] words;
        Date date = Calendar.getInstance().getTime();
        StringBuilder stringBuilder = new StringBuilder();

        String returnString = "";
        switch(num){
            case 1 :
                System.out.println(Math.sqrt(num2));
                returnString = Double.toString(Math.sqrt(num2));
                break;
            case 2 :
                System.out.println(date);
                returnString = date.toString();
                break;
            case 3 :
                words = strResult.split(" ");
                for(String word : words) {
                    System.out.print(word + " ");
                    stringBuilder.append(word + " ");
                }
                returnString = stringBuilder.toString();
                System.out.println();
        }
        return returnString;
    }
}
