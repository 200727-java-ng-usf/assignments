package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T41ArrayConsecutiveMaxTest {
	Q41ArrayConsecutiveMax sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q41ArrayConsecutiveMax();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void arrayMaxConsecutiveSumNotNull() {
		assertNotNull(sut);
	}

	@Test
	public void arrayMaxConsecutiveSum() {
		assertEquals(0, sut.arrayMaxConsecutiveSum(null, Integer.MAX_VALUE));
	}

	@Test
	public void arrayMaxConsecutiveSumMax3() {
		assertEquals(6, sut.arrayMaxConsecutiveSum(new int[]{1, 2, 3}, Integer.MAX_VALUE));
	}

	@Test
	public void arrayMaxConsecutiveSumMin3() {
		assertEquals(0, sut.arrayMaxConsecutiveSum(new int[]{1, 2, 3}, Integer.MIN_VALUE));
	}

	@Test
	public void arrayMaxConsecutiveSum13() {
		assertEquals(3, sut.arrayMaxConsecutiveSum(new int[]{1, 2, 3}, 1));
	}

	@Test
	public void arrayMaxConsecutiveSumReverse3() {
		assertEquals(5, sut.arrayMaxConsecutiveSum(new int[]{3, 2, 1}, 2));
	}
}