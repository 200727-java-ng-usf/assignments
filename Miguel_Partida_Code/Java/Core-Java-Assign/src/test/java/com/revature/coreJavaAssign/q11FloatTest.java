package com.revature.coreJavaAssign;

import com.revature.anotherOne.q11Driver;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Float.valueOf;
import static org.junit.Assert.*;

public class q11FloatTest {
    private q11Float sut1;
    private q11Driver sut2;

    @Before
    public void setUp() {
        sut1 = new q11Float();
        sut2 = new q11Driver();
    }

    @Test
    public void testWhatIsExpected() {
        float float1 = valueOf(sut2.float1);
        float float2 = valueOf(sut2.float2);
        float[] expected = {float1,float2};
        float delta = 1f;
        assertArrayEquals(expected,sut1.floatsFromThere(),delta);
    }
}