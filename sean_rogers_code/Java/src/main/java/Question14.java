import java.util.Calendar;
import java.util.Date;

public class Question14 {
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
