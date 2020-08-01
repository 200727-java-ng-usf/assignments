package com.revature;

public class StringReverserQ3 {

    private int length = 0;
    private String str = "";

    public StringReverserQ3(String source) {
        this.str = new String(source);
        this.length = this.str.length();
    }

    public void reverse() {
        for (int i = this.length - 1; i >= 0; i--) {
            this.str = this.str.concat(String.valueOf(this.str.charAt(i)));
        }
        this.str = this.str.substring(this.length);
    }

    @Override
    public String toString() {
        return this.str;
    }

    public static void main(String[] args) {
        StringReverserQ3 flipMe = new StringReverserQ3("Reversed String");
        flipMe.reverse();
        System.out.println("Reversed String: " + flipMe);

        String testMe = new String("A");
        System.out.println(testMe.substring(0, testMe.length()));
    }
}
