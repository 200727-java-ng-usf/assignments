package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class T37LambdasTest {
	Q37Lambdas sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q37Lambdas();
	}

	@After
	public void tearDown() throws Exception { sut = null;
	}

	@Test
	public void sum() {
		List<Integer> n = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			n.add(i);
		}
		assertEquals(45, sut.sum(n));
	}
}