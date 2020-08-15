package com.revature;


import java.lang.reflect.Field;
import java.util.Arrays;

public class ShortString {

    public static String subString(String str, int begin, int end){

        Field f = null;
        try {
            f = String.class.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f.setAccessible(true);
        char[] tab = new char[0];
        try {
            tab = (char[])f.get(str);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        f.setAccessible(false);
        return new String(tab, begin, begin - end);

    }

}
