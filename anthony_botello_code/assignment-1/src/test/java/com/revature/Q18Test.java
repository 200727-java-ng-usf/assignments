package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import com.revature.Q18.Subclass;
import com.revature.Q18.Superclass;

import org.junit.Test;

public class Q18Test {

    private static Subclass subclass = new Subclass();

    @Test // test that subclass extends superclass
    public void testInheritance(){
        assertTrue(subclass instanceof Superclass);
    }

    @Test //test if String has uppercase characters
    public void testHasUpperCase(){

        assertTrue(subclass.hasUpperCase("ABCdef"));
        
        assertFalse(subclass.hasUpperCase("abcdef"));
    }

    @Test // test that all lowercase strings convereted to uppercase
    public void testToUpperCase(){
        assertEquals("ABCDEF", subclass.toUpperCase("ABCdef"));
    }
    
    @Test // test that parsing integer throws NumberFormatException when String not numeric
    public void testThrowsNumberFormatException(){
        assertThrows(NumberFormatException.class, () -> subclass.parseInteger("ABCdef"));
    }

    @Test // test that parsing integer returns integer  + 10
    public void testReturnsIntegerPlus10(){
        assertTrue(subclass.parseInteger("10") == 20);
    }
}