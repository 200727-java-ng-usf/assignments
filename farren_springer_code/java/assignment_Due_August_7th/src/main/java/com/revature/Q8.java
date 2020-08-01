import java.util.Arrays;
package com.revature.production;

public class Q8 {


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

        // test
        System.out.println(Arrays.toString(reverse_Of_The_List));

        // check for palindromes (to see how long index for palindromes array should be)
        for(int i = 0; i < originalList.length - 1; i++){
            if(isPalindrome(reverse_Of_The_List[i], originalList[i])){
                counter++;
            }
            else{
                System.out.println("nope");
            }
        }

        // create an array to store the palindromes
        String[] palindromes = new String[counter];

        // store the palindromes in the palindromes array
        

        // parse through the list. If index 0 is a palindrome, store in 0 index. If not, then the original list index moves, but the palindrome index stays the same until it's true

        System.out.println(counter);
        System.out.println(isPalindrome(reverse_Of_The_List[1], originalList[1]));// test

        System.out.println(reverse_Of_The_List[1]);
        System.out.println(originalList[1]);
        System.out.println(palindromes[0]);
        System.out.println(palindromes[3]);

        }




}

