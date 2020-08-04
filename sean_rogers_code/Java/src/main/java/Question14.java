import java.util.Calendar;
import java.util.Date;

public class Question14 {
    public String switchDemo(int num) {
        String strResult = "I am learning core java";
        String[] words;
        Date date = Calendar.getInstance().getTime();
        StringBuilder stringBuilder = new StringBuilder();

        String returnString = "";
        switch(num){
            case 1 :
                System.out.println(Math.sqrt(16));
                returnString = Double.toString(Math.sqrt(16));
                break;
            case 2 :
                System.out.println(date);
                returnString = date.toString();
                break;
            case 3 :
                words = strResult.split(" ");
                for(String word : words) {
                    System.out.print(word + " ");
                    stringBuilder.append(word + " s");
                }
                returnString = stringBuilder.toString();
                System.out.println();
        }
        return returnString;
    }
}
