package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q6Test {

        Q6 showTest;

        @Before
        public void setShowTest(){
            this.showTest = new Q6();
        }
        @After
        public void cutShowTest(){
            this.showTest = null;
        }
        @Test
        public void isEven() {
            int number =6;
            assertTrue(showTest.isEven(number));

    }
}