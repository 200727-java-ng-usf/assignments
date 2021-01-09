package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T59HIndexTest {
	Q59HIndex sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q59HIndex();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void hIndexNull() {
		int[] test = null;
		assertEquals(0, sut.hIndex(test));
	}

	@Test
	public void hIndexZero() {
		int[] test = {};
		assertEquals(0, sut.hIndex(test));
	}

	@Test
	public void hIndex() {
		int[] test = {4, 3, 0, 1, 5};
		assertEquals(3, sut.hIndex(test));
	}

	@Test
	public void hIndexGreater() {
		int[] test = {4, 3};
		assertEquals(2, sut.hIndex(test));
	}

	@Test
	public void hIndexLesser() {
		int[] test = {1, 1, 1, 1, 1};
		assertEquals(1, sut.hIndex(test));
	}

	@Test
	public void hIndexZeroes() {
		int[] test = {0, 0, 0, 0, 0};
		assertEquals(0, sut.hIndex(test));
	}
}