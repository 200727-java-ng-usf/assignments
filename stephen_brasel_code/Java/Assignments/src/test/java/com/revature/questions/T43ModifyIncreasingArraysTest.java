package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T43ModifyIncreasingArraysTest {
	Q43ModifyIncreasingArrays sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q43ModifyIncreasingArrays();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void isModifiableArrayNotNull() {
		assertNotNull(sut);
	}

	@Test
	public void isModifiableArrayNull() {
		assertTrue(sut.isModifiableArray(null));
	}

	@Test
	public void isModifiableArrayEmpty() {
		assertTrue(sut.isModifiableArray(new int[]{}));
	}

	@Test
	public void isModifiableArrayOne() {
		assertTrue(sut.isModifiableArray(new int[]{1}));
	}

	@Test
	public void isModifiableArrayOneDuplicate() {
		assertTrue(sut.isModifiableArray(new int[]{1, 1}));
	}

	@Test
	public void isModifiableArrayTwoDuplicates() {
		assertFalse(sut.isModifiableArray(new int[]{1, 1, 1}));
	}

	@Test
	public void isModifiableArrayDescending() {
		assertTrue(sut.isModifiableArray(new int[]{2, 1}));
	}

	@Test
	public void isModifiableArrayDescending3() {
		assertFalse(sut.isModifiableArray(new int[]{3, 2, 1}));
	}

	@Test
	public void isModifiableArrayLongForm() {
		int length = 100;
		int[] check = new int[length];
		for (int i = 0; i < length; i++) {
			check[i] = i;
		}
		assertTrue(sut.isModifiableArray(check));
	}
}