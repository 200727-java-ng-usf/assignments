package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T51SwapVarsTest {
	Q51SwapVars sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q51SwapVars();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void swapVars(){
		assertNotNull(sut);
	}

	@Test
	public void swapZero() {
		int[] x = {10};
		int[] y = {5};
		sut.swapZero(x, y);
		assertEquals(5, x[0]);
		assertEquals(10, y[0]);
	}

	@Test
	public void swapAdditive() {
		int[] x = {10};
		int[] y = {5};
		sut.swapAdditive(x, y);
		assertEquals(5, x[0]);
		assertEquals(10, y[0]);
	}

	@Test
	public void swapMultiplicative() {
		int[] x = {10};
		int[] y = {5};
		sut.swapMultiplicative(x, y);
		assertEquals(5, x[0]);
		assertEquals(10, y[0]);
	}

	@Test
	public void swapXOR() {
		int[] x = {10};
		int[] y = {5};
		sut.swapXOR(x, y);
		assertEquals(5, x[0]);
		assertEquals(10, y[0]);
	}

	@Test
	public void swapString() {
		String[] x = {"abc"};
		String[] y = {"def"};
		sut.swapString(x, y);
		assertEquals("def", x[0]);
		assertEquals("abc", y[0]);
	}
}