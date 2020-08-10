package com.revature;
import org.junit.Test;

public class Q20Test {
    Q20 showTest = new Q20();




    @Test
    public void readTxtFile() {
        showTest.readTxtFile("src/main/resources/Data.txt");
    }
}