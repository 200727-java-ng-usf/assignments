package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PalindromeQ8 {

    // List of words
    private ArrayList<String> words = new ArrayList<String>(0);

    /**
     * Default class constructor.
     */
    public PalindromeQ8() {
        super();
    }

    /**
     * Class constructor initializes words list to contain the specified words
     * passed to the constructor.
     *
     * @param words
     */
    public PalindromeQ8(String... words) {
        this();
        this.words.ensureCapacity(words.length);
        this.words.addAll(Arrays.asList(words));
    }

    /**
     * isPalindrome is a static class method evaluates if the specified word
     * passed to the method is a palindrome and if so, returns true.
     *
     * @param word String to be evaluated as a palindrome.
     * @return true iff word is a palindrome.
     */
    public static boolean isPalindrome(String word) {
        String lower = word.toLowerCase();
        for (int i = 0, j = lower.length() - 1; i < j; i++, j--) {
            if (lower.charAt(i) != lower.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Predicate (conditional statement) to evaluate if a String is a palindrome
     * by utilizing the isPalindrome(String word) static method to evaluate the
     * target String
     *
     * @return Predicate which evaluates to true iff the target String is a palindrome.
     */
    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    private Predicate<String> palindrome() {
        return PalindromeQ8::isPalindrome;
    }

    /**
     * isPalindrome filters an ArrayList of Strings to find the members which are
     * palindromes.
     *
     * @param words ArrayList of Strings to be tested to match the specified predicate
     * @param predicate Predicate to be used to filter the ArrayList of words for matches
     * @return ArrayList of String values containing the subset of words that match
     * the specified predicate
     */
    private ArrayList<String> filter(ArrayList<String> words, Predicate<String> predicate) {
        // Converts the ArrayList<String> of words into a stream, filters it by
        // the specified filter (palindrome()), collects the resulting matches
        // into a List<String> and casts that as an ArrayList<String>
        return (ArrayList<String>) words.stream()
                .filter(predicate)
                .collect(Collectors.<String>toList());
    }

    /**
     * setWords loads a new ArrayList into this Palindrome containing the list of
     * Strings passed in the words parameter.
     *
     * @param words Varargs array of Strings to be loaded as the new word list
     *              for this Palindrome
     */
    public void setWords(String... words) {
        this.words = new ArrayList<String>(words.length);
        this.words.addAll(Arrays.asList(words));
    }

    /**
     * getWords returns this Palindrome's stored list of words as a String array
     *
     * @return String[] list of words stored in this Palindrome
     */
    public String[] getWords() {
        String[] words = new String[this.words.size()];
        this.words.toArray(words);
        return words;
    }

    /**
     * isPalindrome filters this Palindrome's String word list against the palindrome()
     * Predicate, removing any non-palindrome words from the list.
     */
    public void isPalindrome() {
        this.words = filter(this.words, palindrome());
    }

    /**
     * toString generates String representation of this Palindrome object.
     *
     * @return String representation of this Palindrome object
     */
    @Override
    public String toString() {
        return "PalindromeQ8{" +
                "words=" + Arrays.toString(words.toArray()) +
                '}';
    }

    /**
     * equals evaluates whether the specified object is equal to this Palindrome.
     *
     * @param o Object to be compared to this Palindrome
     * @return true iff o is equal to this Palindrome
     */
    @Override
    public boolean equals(Object o) {
        // If the object being tested references the same object as this Palindrome,
        // it must equal this Palindrome
        if (this == o) return true;

        // If the object being tested is not a Palindrome, it cannot equal this Palindrome
        if (o == null || getClass() != o.getClass()) return false;
        PalindromeQ8 that = (PalindromeQ8) o;

        // If word lists are not the same size, the object being tested cannot
        // equal this Palindrome
        if (words.size() != that.words.size()) {
            return false;
        }

        // If each String in the word list of the object being tested is equal to
        // the equivalent String in the word list of this Palindrome, then it is
        // equal to this Palindrome.
        for (int i = 0; i < words.size(); i++) {
            if (!((String)words.get(i)).equals(((String)that.words.get(i)))) {
                return false;
            }
        }
        return true;
    }

    /**
     * hashCode create a hashCode which will always be the same for Palindromes
     * which are equal.
     *
     * @return hashCode value generated for this Palindrome
     */
    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
