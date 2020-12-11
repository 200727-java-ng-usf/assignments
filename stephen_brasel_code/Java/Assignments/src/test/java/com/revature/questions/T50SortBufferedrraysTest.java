package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T50SortBufferedrraysTest {
	Q50SortBufferedrrays sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q50SortBufferedrrays();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void sortnullfull() {
		Integer a[] = null, b[] = {2,3,4,5};
		Integer expected[] = {null};
		sut.sort(a,b);
		assertNull(a);
	}

	@Test
	public void sortfullnull() {
		Integer a[] = {2,3,4,5}, b[] = null;
		Integer expected[] = {2, 3, 4, 5};
		sut.sort(a,b);
		assertArrayEquals(expected, a);
	}

	@Test
	public void sortnullnull() {
		Integer a[] = null, b[] = null;
		Integer expected[] = {null};
		sut.sort(a,b);
		assertNull(a);
	}
}