package com.revature.coreJavaAssign;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class q19ArrayListTest {
    private q19ArrayList sut;

    @Before
    public void setUp(){
        sut = new q19ArrayList();
    }

    @Test
    public void test1To10(){
    ArrayList<Integer> oneToTen = new ArrayList<>();
        for(int i = 0; i <=10;i++) {
            oneToTen.add(i);
        }
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(9);
        assertEquals(expected,sut.q19ArrayList(oneToTen));
    }
}