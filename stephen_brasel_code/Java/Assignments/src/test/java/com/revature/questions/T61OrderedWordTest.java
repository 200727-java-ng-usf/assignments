package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T61OrderedWordTest {
	Q61OrderedWord sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q61OrderedWord();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void inOrderABC() {
		assertTrue(sut.inOrder("abc"));
	}

	@Test
	public void inOrder() {
		assertTrue(sut.inOrder(""));
	}

	@Test
	public void inOrderA() {
		assertTrue(sut.inOrder("a"));
	}

	@Test
	public void inOrderACB() {
		assertFalse(sut.inOrder("acb"));
	}

	@Test
	public void inOrderNull() {
		assertFalse(sut.inOrder(null));
	}
}