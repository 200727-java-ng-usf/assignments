package com.revature.coreJavaAssign;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class q12StoreArrayTest {
    private q12StoreArray sut;

    @Before
    public void setUp() {
        sut = new q12StoreArray();
    }

    @Test
    public void even100() {
        int[] actual = new int[50];
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i=1; i<51;i++){
            if(i % 2 == 0){
                expected.add(i);
            }
        }
        assertEquals(expected,sut.even100(actual));

    }
}