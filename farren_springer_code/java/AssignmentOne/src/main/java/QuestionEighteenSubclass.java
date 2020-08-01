import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class QuestionEighteenSubclass extends QuestionEighteen {

    private String word;

    public QuestionEighteenSubclass() {
        System.out.println("QuestionEighteenSubclass no-args constructor called!");
        this.word = "Hey thErE how yoU DoIn";
    }

    public QuestionEighteenSubclass(String word) {
        super();
        System.out.println("QuestionEighteenSubclass parameterized constructor called!");
        this.word = word;
    }

    @Override
    public boolean hasUpperCaseLetters() {
        System.out.println("Does it have upper case letters? The code for that would go here.");
        int counter = 0;
        for(int i = 0; i < word.length(); i++) {

            if(Character.isUpperCase(word.charAt(i))) {
                counter++;
            }
        }
        if(counter == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String convertToUppercase() {

        String result;
        result = word.toUpperCase();
        return result;

    }


    @Override
    public int convertToIntAndAddTen() {

        return 4;

    }


}
