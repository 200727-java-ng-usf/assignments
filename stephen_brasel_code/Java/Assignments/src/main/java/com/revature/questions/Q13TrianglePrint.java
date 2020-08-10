package com.revature.questions;

public class Q13TrianglePrint {
//    Q13. Display the triangle on the console as follows using any type of loop.
//    Do NOT use a simple group of print statements to accomplish this.
//            0
//            1 0
//            1 0 1
//            0 1 0 1

    /*
        a = 0; b = 1;

        concat 0 to the end
        prepend 1 to the beginning
        swap (a, b)
    */

    /*
        Alternating 1s and 0s

     */
    /**
     * index i for iterating through a loop in the <code>{@link #triWhile(int)}</code> method
     */
    private int i = 0;
    /**
     * a blank string used to concatenate iterations of the triangle
     * pattern in the <code>{@link #triWhile(int)}</code> method
     */
    private String str = "";
    /**
     * An array of strings whose initial indices hold the smallest iterations of the triangle pattern.
     */
    private String[] ret;

    /**
     * A holder string for the triangle pattern variable 0.
     */
    private String a = "0";
    /**
     * A holder string for the triangle pattern variable 1.
     */
    private String b = "1";

    /**
     * Swaps the values in <code>{@link #a}</code> and <code>{@link #b}</code>
     */
    private void swap(){
        String temp = a;
        a=b;
        b=temp;
    }

    /**
     * Prints the following pattern "{@code end}" times:<br>
     * 0<br>
     * 1 0<br>
     * 1 0 1<br>
     * 0 1 0 1<br>
     * @param end the number of times to repeat the pattern
     * @return a <code>{@link String}</code>[] of unformatted iterations of the pattern, i.e. {0,10,101,0101}
     */
    public String[] triWhile(int end) {
        if(end < 0) return new String[]{};
        i = 0;
        ret = new String[end];
        while (i < end) {
            if (i % 2 == 0) {
                str = str.concat(a);
            } else {
                str = b.concat(str);
                swap();
            }
            ret[i] = str;
            i++;
        }
        return ret;
    }

    /**
     * Formats a String element of the output of <code>{@link #triWhile(int)}</code> such that
     * the <code>{@link String}</code>[] {0,10,101,0101}
     * is printed as <br>
     * 0<br>
     * 1 0<br>
     * 1 0 1<br>
     * 0 1 0 1<br>
     * @param str a single <code>{@link String}</code> from the <code>{@link String}</code>[] output of
     *            <code>{@link #triWhile(int)}</code>.
     * @return the formatted <code>{@link String}</code>.
     */
    public static String formatSpacedOutStr(String str) {
        StringBuilder ret = new StringBuilder();
        for (int j = 0; j < str.length(); j++) {
            ret.append(str.charAt(j));
            if (j < str.length() - 1) {
                ret.append(" ");
            }
        }
        return ret.toString();

    }
}
