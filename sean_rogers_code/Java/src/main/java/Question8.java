import java.util.ArrayList;

public class Question8 {
    public ArrayList<String> getPalindromes(ArrayList<String> al) {
        ArrayList<String> palindromes = new ArrayList<String>();
        boolean isPalindrome;

        for(int i = 0; i < al.size(); i++) {
            isPalindrome = true;
            for(int j = 0; j < al.get(i).length() / 2; j++) {
                if(al.get(i).charAt(j) != al.get(i).charAt(al.get(i).length() - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome){
                palindromes.add(al.get(i));
            }
        }

        return palindromes;
    }

}
