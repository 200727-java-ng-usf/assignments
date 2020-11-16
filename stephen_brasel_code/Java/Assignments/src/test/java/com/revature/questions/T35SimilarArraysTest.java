package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T35SimilarArraysTest {
	Q35SimilarArrays sut;
	int[] a;
	int[] b;

	@Before
	public void setUp() throws Exception {
		sut = new Q35SimilarArrays();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void areSimilarSwapNull() {
		a = null;
		b = null;
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapEmpty() {
		a = new int[]{};
		b = new int[]{};
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapNoSwapOne() {
		a = new int[]{1};
		b = new int[]{1};
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapOne10() {
		a = new int[]{1};
		b = new int[]{0};
		assertFalse(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapNoSwapTwo() {
		a = new int[]{1, 2};
		b = new int[]{1, 2};
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapTwo1213() {
		a = new int[]{1, 2};
		b = new int[]{1, 3};
		assertFalse(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapTwo1234() {
		a = new int[]{1, 2};
		b = new int[]{3, 4};
		assertFalse(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapSwapTwo() {
		a = new int[]{1, 2};
		b = new int[]{2, 1};
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapNoSwapThree() {
		a = new int[]{1, 2, 3};
		b = new int[]{1, 2, 3};
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapNoSwapMillion() {
		a = new int[1000000];
		b = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			a[i] = b[i] = i;
		}
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapOneSwapMillion() {
		a = new int[1000000];
		b = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			a[i] = b[i] = i;
		}
		int temp = b[b.length - 1];
		b[b.length - 1] = b[0];
		b[0] = temp;
		assertTrue(sut.areSimilarSwap(a, b));
	}

	@Test
	public void areSimilarSwapTwoSwapMillion() {
		a = new int[1000000];
		b = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			a[i] = b[i] = i;
		}
		int temp = b[b.length - 1];
		b[b.length - 1] = b[b.length - 2];
		b[b.length - 2] = temp;
		temp = b[b.length - 2];
		b[b.length - 2] = b[b.length - 3];
		b[b.length - 3] = temp;
		assertFalse(sut.areSimilarSwap(a, b));
	}
	@Test
	public void areSimilarCountNull() {
		a = null;
		b = null;
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountEmpty() {
		a = new int[]{};
		b = new int[]{};
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountNoSwapOne() {
		a = new int[]{1};
		b = new int[]{1};
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountOne10() {
		a = new int[]{1};
		b = new int[]{0};
		assertFalse(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountNoSwapTwo() {
		a = new int[]{1, 2};
		b = new int[]{1, 2};
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountTwo1213() {
		a = new int[]{1, 2};
		b = new int[]{1, 3};
		assertFalse(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountTwo1234() {
		a = new int[]{1, 2};
		b = new int[]{3, 4};
		assertFalse(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountSwapTwo() {
		a = new int[]{1, 2};
		b = new int[]{2, 1};
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountNoSwapThree() {
		a = new int[]{1, 2, 3};
		b = new int[]{1, 2, 3};
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountNoSwapMillion() {
		a = new int[1000000];
		b = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			a[i] = b[i] = i;
		}
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountOneSwapMillion() {
		a = new int[1000000];
		b = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			a[i] = b[i] = i;
		}
		int temp = b[b.length - 1];
		b[b.length - 1] = b[0];
		b[0] = temp;
		assertTrue(sut.areSimilarCount(a, b));
	}

	@Test
	public void areSimilarCountTwoSwapMillion() {
		a = new int[1000000];
		b = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			a[i] = b[i] = i;
		}
		int temp = b[b.length - 1];
		b[b.length - 1] = b[b.length - 2];
		b[b.length - 2] = temp;
		temp = b[b.length - 2];
		b[b.length - 2] = b[b.length - 3];
		b[b.length - 3] = temp;
		assertFalse(sut.areSimilarCount(a, b));
	}
}