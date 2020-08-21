package com.revature;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q11Test {

    @Test
    public void testing(){
        System.out.println(Q11.accessingAnotherPackageClass().get(0));

        Float expected = 1.1f;
        assertEquals(expected,Q11.accessingAnotherPackageClass().get(0));
    }
}
