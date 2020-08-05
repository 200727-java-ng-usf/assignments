package com.revature;
import org.junit.Test;

import java.io.IOException;

public class Q20Test {
    Q20 showTest = new Q20();




    @Test
    public void readTxtFile() {
        showTest.readTxtFile("/200727-java-ng-usf/assignments/yuanfeng_Gu_code/src/main/resources/Data.txt");
    }
}