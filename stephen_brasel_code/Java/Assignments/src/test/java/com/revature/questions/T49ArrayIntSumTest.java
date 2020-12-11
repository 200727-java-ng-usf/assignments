package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T49ArrayIntSumTest {
	Q49ArrayIntSum sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q49ArrayIntSum();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void canSumNull() {
		assertFalse(sut.canSum(null, 0));
	}

	@Test
	public void canSumEmpty() {
		assertFalse(sut.canSum(new int[]{}, 4));
	}

	@Test
	public void canSumGiven() {
		assertTrue(sut.canSum(new int[]{10, 15, 3, 7}, 17));
	}

	@Test
	public void canSum1thru44() {
		assertTrue(sut.canSum(new int[]{1, 2, 3, 4}, 4));
	}

	@Test
	public void canSum1thru94() {
		assertFalse(sut.canSum(new int[]{1, 2, 8, 9}, 4));
	}
}