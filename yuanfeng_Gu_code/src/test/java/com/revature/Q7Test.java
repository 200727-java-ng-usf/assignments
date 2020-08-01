package com.revature;

import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class Q7Test {


    @Test
    public void compareTo() {
        TreeSet<Q7> empCompare = new TreeSet<Q7>();
        Q7 employee1 = new Q7("Justin","IT",30);
        Q7 employee2 = new Q7("Dave","Sales",20);


        empCompare.add(employee1);
        empCompare.add(employee2);

         // this.age - employee2.age = 10
        assertEquals(10,employee1.compareTo(employee2));




    }
}