package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T31CyclicRotatingStringsTest {
	Q31CyclicRotatingStrings sut;

	@Before
	public void setUp() {
		sut = new Q31CyclicRotatingStrings();
	}

	@After
	public void tearDown() {
		sut = null;
	}

	@Test
	public void isCyclicRotatedA() {
		assertTrue(sut.isCyclicRotated("A", "A"));
	}

	@Test
	public void isNotCyclicRotatedAB() {
		assertFalse(sut.isCyclicRotated("A", "B"));
	}

	@Test
	public void isCyclicRotatedAA() {
		assertTrue(sut.isCyclicRotated("AA", "AA"));
	}

	@Test
	public void isCyclicRotatedAB() {
		assertTrue(sut.isCyclicRotated("AB", "AB"));
	}

	@Test
	public void isNotCyclicRotatedABA_AB() {
		assertFalse(sut.isCyclicRotated("ABA", "AB"));
	}

	@Test
	public void isCyclicRotatedAB_ABAB() {
		assertTrue(sut.isCyclicRotated("AB", "ABAB"));
	}

	@Test
	public void isNotCyclicRotatedAB_ABAB() {
		assertFalse(sut.isCyclicRotated("AB", "ABABC"));
	}

	@Test
	public void isCyclicRotatedABCD_CDAB() {
		assertTrue(sut.isCyclicRotated("ABCD", "CDAB"));
	}

	@Test
	public void isNotCyclicRotatedABCD_CADB() {
		assertFalse(sut.isCyclicRotated("ABCD", "CADB"));
	}

	@Test
	public void isCyclicRotatedABACD_ACDAB() {
		assertTrue(sut.isCyclicRotated("ABACD", "ACDAB"));
	}
}