package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class T58HanoiTest {
	Q58Hanoi sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q58Hanoi();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println();
		sut = null;
	}

	@Test
	public void hanoiRecursion() {
		for (int i = 0; i < 5; i++) {
			sut.hanoiRecursion(i, 'A', 'B', 'C');
			System.out.println();
		}
	}
}