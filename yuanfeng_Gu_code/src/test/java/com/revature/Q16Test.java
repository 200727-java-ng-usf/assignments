package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q16Test {
    Q16 showTest = new Q16();

    @Test
    public void commandLine() {

        String[] str1= new String[]{"aaa", "bbb"};
        showTest.commandLine(str1);
    }
}