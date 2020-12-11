package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T42KnightOnBoardProbabilityTest {
	Q42KnightOnBoardProbability sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q42KnightOnBoardProbability();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void knightOnBoardProbability88244() {
		assertEquals(0.875, sut.knightOnBoardProbability(8, 8, 2, 4, 4), 0.0001);
	}

	@Test
	public void knightOnBoardProbability88255() {
		assertEquals(0.65625, sut.knightOnBoardProbability(8, 8, 2, 5, 5), 0.0001);
	}
}