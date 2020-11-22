package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T44SumStringTest {
	Q44SumString sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q44SumString();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void sumInternalStringNotNull() {
		assertNotNull(sut);
	}

	@Test
	public void sumInternalStringNull() {
		assertEquals(0, sut.sumInternalString(null));
	}

	@Test
	public void sumInternalStringEmpty() {
		assertEquals(0, sut.sumInternalString(""));
	}

	@Test
	public void sumInternalString5() {
		assertEquals(5, sut.sumInternalString("5"));
	}

	@Test
	public void sumInternalStringA5() {
		assertEquals(5, sut.sumInternalString("A5"));
	}

	@Test
	public void sumInternalString5A() {
		assertEquals(5, sut.sumInternalString("5A"));
	}

	@Test
	public void sumInternalString55() {
		assertEquals(55, sut.sumInternalString("55"));
	}

	@Test
	public void sumInternalStringString() {
		assertEquals(14, sut.sumInternalString("FIVE5ONE1SEVEN8"));
	}

	@Test
	public void sumInternalStringGivenCase() {
		assertEquals(221, sut.sumInternalString("ABC123DEF098QWE"));
	}
}