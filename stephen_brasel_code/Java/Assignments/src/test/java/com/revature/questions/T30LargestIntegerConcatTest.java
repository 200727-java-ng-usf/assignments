package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T30LargestIntegerConcatTest {
	Q30LargestIntegerConcat sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q30LargestIntegerConcat();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void concatLargestInt0() {
		long res = sut.concatLargestInt(new Integer[] {0});
		assertEquals(0, res);
	}
	@Test
	public void concatLargestIntZeroes() {
		long res = sut.concatLargestInt(new Integer[] {0, 0, 0, 0, 0, 0, 0, 0, 0});
		assertEquals(0, res);
	}
	@Test
	public void concatLargestInt1() {
		long res = sut.concatLargestInt(new Integer[] {1});
		assertEquals(1, res);
	}
	@Test
	public void concatLargestInt10() {
		long res = sut.concatLargestInt(new Integer[] {1, 0});
		assertEquals(10, res);
	}
	@Test
	public void concatLargestInt100() {
		long res = sut.concatLargestInt(new Integer[] {1, 0, 0});
		assertEquals(100, res);
	}
	@Test
	public void concatLargestInt100Unsorted() {
		long res = sut.concatLargestInt(new Integer[] {0, 1, 0});
		assertEquals(100, res);
	}
	@Test
	public void concatLargestInt200010020101() {
		long res = sut.concatLargestInt(new Integer[] {1, 0, 10, 20, 200, 100});
		assertEquals(202001101000L, res);
	}
	@Test
	public void concatLargestInt908765432() {
		long res = sut.concatLargestInt(new Integer[] {9, 8, 7, 6, 5, 4, 3, 2, 0});
		assertEquals(987654320, res);
	}
	@Test
	public void concatIncorreectLargestInt908765432() {
		long res = sut.concatLargestInt(new Integer[] {9, 8, 7, 6, 5, 4, 3, 2, 0});
		assertNotEquals(908765432, res);
	}
	@Test
	public void concatIncorreectLargestInt77245217() {
		long res = sut.concatLargestInt(new Integer[] {17, 7, 2, 45, 72});
		assertEquals(77245217, res);
	}
	@Test
	public void concatIncorreectLargestInt787724521710100() {
		long res = sut.concatLargestInt(new Integer[] {17, 7, 2, 45, 72, 10, 100, 78});
		assertEquals(787724521710100L, res);
	}
	@Test
	public void concatIncorreectLargestInt5655655555554() {
		long res = sut.concatLargestInt(new Integer[] {5, 55, 56, 54, 555, 556});
		assertEquals(5655655555554L, res);
	}
}