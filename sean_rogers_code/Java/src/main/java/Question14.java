import java.util.Calendar;
import java.util.Date;

public class Question14 {
    public void switchDemo(int num) {
        String strResult = "I am learning core java";
        String[] words;
        Date date = Calendar.getInstance().getTime();
        switch(num){
            case 1 :
                System.out.println(Math.sqrt(16));
                break;
            case 2 :
                System.out.println(date);
                break;
            case 3 :
                words = strResult.split(" ");
                for(String word : words) {
                    System.out.print(word + " ");
                }
                System.out.println();
        }
    }
}
