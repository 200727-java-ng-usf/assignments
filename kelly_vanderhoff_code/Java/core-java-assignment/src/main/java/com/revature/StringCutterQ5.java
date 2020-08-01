package com.revature;

public class StringCutterQ5 {

    private String str;

    public StringCutterQ5(String str) {
        this.str = new String(str);
    }

    public void cut(int i) {
        char[] c = new char[i];
        for (int l = 0; l < i; l++) {
            c[l] = this.str.charAt(l);
        }
        this.str = new String(c);
    }

    @Override
    public String toString() {
        return this.str;
    }

    public static void main(String[] args) {
        StringCutterQ5 strCut = new StringCutterQ5("String Cutter");
        int len = 11;
        strCut.cut(len);
        System.out.format("'String Cutter' cut at index %d produces: ", len);
        System.out.println(strCut);
    }
}
