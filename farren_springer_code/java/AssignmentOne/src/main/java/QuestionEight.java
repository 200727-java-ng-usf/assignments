import java.util.Arrays;

public class QuestionEight {


    static int counter = 0;

    public static String reverseIt(String str) {
        String rev = "";
        for(int i = str.length() -1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    private static boolean isPalindrome(String s, String s1) {
        return s.equals(s1);
    }

    public static void main(String[] args) {

        // create temporary variable to store reverse words
        String item = null;

        // initialize array
        String originalList[] = {"karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john", "refer", "billy", "did"};

        // create an array to store the reverses
        String[] reverse_Of_The_List = new String[originalList.length];

        // parse through the list and reverse each word and store it in reverse list
        for(int j = 0; j < originalList.length; j++){
            reverse_Of_The_List[j] = reverseIt(originalList[j]);
        }

        // how many palindromes are there? Use this int to initialize the palindromes array
        for(int i = 0; i < reverse_Of_The_List.length; i++){
            if(isPalindrome(reverse_Of_The_List[i], originalList[i])){
                counter++;
            }
        }

        String[] palindromes = new String[counter];

        // test
        System.out.println(Arrays.toString(reverse_Of_The_List));
        System.out.println(Arrays.toString(originalList));
        System.out.println(counter);

        // store the palindromes in the palindromes array
        // parse through the list of reverses.
        int anotherCounter = 0;
        for(int i = 0; i < reverse_Of_The_List.length; i++){

            if(isPalindrome(reverse_Of_The_List[i], originalList[i])){
                palindromes[anotherCounter] = reverse_Of_The_List[i];
                anotherCounter++;
            }
        }
        System.out.println(Arrays.toString(palindromes));

    }




}