package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T60CompleteTheWordTest {
	Q60CompleteTheWord sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q60CompleteTheWord();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void canCompletebt() {
		assertTrue(sut.canComplete("bt", "beautiful"));
	}

	@Test
	public void canCompletel() {
		assertTrue(sut.canComplete("l", "beautiful"));
	}

	@Test
	public void canCompletebeautifu() {
		assertTrue(sut.canComplete("beautifu", "beautiful"));
	}

	@Test
	public void canCompletebeautiful() {
		assertTrue(sut.canComplete("beautiful", "beautiful"));
	}

	@Test
	public void canCompletebeautifull() {
		assertFalse(sut.canComplete("beautifull", "beautiful"));
	}

	@Test
	public void canCompletebutl() {
		assertTrue(sut.canComplete("butl", "beautiful"));
	}

	@Test
	public void canCompleteaaaabaaaa() {
		assertTrue(sut.canComplete("aaaa", "baaaa"));
	}

	@Test
	public void canComplete() {
		assertFalse(sut.canComplete("ababba", "baabbaa"));
	}

	@Test
	public void canCompleteaaaaabaaaa() {
		assertTrue(sut.canComplete("aaaa", "abaaaa"));
	}

	//region Negative Tests
	@Test
	public void canCompletebutlz() {
		assertFalse(sut.canComplete("butlz", "beautiful"));
	}

	@Test
	public void canCompleteNullWord() {
		assertFalse(sut.canComplete(null, "beautiful"));
	}

	@Test
	public void canCompleteWordNull() {
		assertFalse(sut.canComplete("beautiful", null));
	}

	@Test
	public void canCompleteNullNull() {
		assertFalse(sut.canComplete(null, null));
	}

	@Test
	public void canCompleteEmpty() {
		assertTrue(sut.canComplete("", "beautiful"));
	}

	@Test
	public void canCompleteEmptyEmpty() {
		assertTrue(sut.canComplete("", ""));
	}

	@Test
	public void canCompleteBeautifulEmpty() {
		assertFalse(sut.canComplete("beautiful", ""));
	}
	//endregion
}