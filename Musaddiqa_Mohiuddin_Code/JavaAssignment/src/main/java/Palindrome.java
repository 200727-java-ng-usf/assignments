import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	private List<String> stringList;
	
	
    public List<String> getStringList() {
		return stringList;
	}

	static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public void main(List<String> inputList) {
        
        System.out.println("List of name's Before palindrome");
        for (String name : inputList) {
            System.out.println(name);
        }
        List<String> palindromeList = new ArrayList<String>();

        for (String name : inputList) {
            if (isPalindrome(name)) {
                palindromeList.add(name);
            }

        }

        System.out.println("List of palindrome name's");
        for (String name : palindromeList) {
            System.out.println(name);
        }
        
        this.stringList = palindromeList;
    }
}