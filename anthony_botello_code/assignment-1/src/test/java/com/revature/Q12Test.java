package com.revature;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Q12Test {
    
    @Test // tests that returned array contains all the evens from 1 to 100
    public void testReturnsAllEvens1To100(){
        
        int[] numbers1To100 = new int[100];
        int[] evens1To100 = new int[50];
        
        for(int i = 0, j = 0; i < 100; i++){

            numbers1To100[i] = i + 1;
            
            if((i + 1) % 2 == 0){
                evens1To100[j] = i + 1;
                j++;
            }
        }

        int[] result = Q12.getEvens(numbers1To100);
        
        assertArrayEquals(evens1To100, result);
    }
}