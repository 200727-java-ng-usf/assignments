import org.junit.Test;

import java.util.ArrayList;

public class Question8Test {
    @Test
    public void question8Test(){
        //Question 8 test
        Question8 question8 = new Question8();
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<String> expectedOutput = new ArrayList<String>();

        String[] words1 = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};
        String[] words2 = {"madam", "civic", "radar", "kayak", "refer", "did"};

        for(String word : words1) {
            input.add(word);
        }
        for(String word : words2) {
            expectedOutput.add(word);
        }

        assert(question8.getPalindromes(input).toString().equals(expectedOutput.toString()));
    }

    @Test
    public void question8Test2(){
        //Question 8 negative test
        Question8 question8 = new Question8();
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<String> expectedOutput = new ArrayList<String>();

        String[] words1 = {"karan", "madam"};
        String[] words2 = {"karen", "madam"};

        for(String word : words1) {
            input.add(word);
        }
        for(String word : words2) {
            expectedOutput.add(word);
        }

        assert(!question8.getPalindromes(input).toString().equals(expectedOutput.toString()));
    }
}
