package com.revature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class Q7Test {
    TreeSet<Q7> empCompare;
    Q7 employee1;
    Q7 employee2;

    @Before
    public void setTest(){
        this.empCompare = new TreeSet<Q7>();
        this.employee1 = new Q7("Justin","IT",30);
        this.employee2 =  new Q7("Dave","Sales",20);

    }
    @After
    public void cutTest(){
        this.empCompare = null;
        this.employee1 = null;
        this.employee2 =  null;
    }


    @Test
    public void compareTo() {

        empCompare.add(employee1);
        empCompare.add(employee2);

         // this.age - employee2.age = 10
        assertNotNull(employee2.compareTo(employee1));
        assertEquals(10,employee1.compareTo(employee2));


    }
}