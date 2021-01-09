package com.revature.questions;

import com.revature.util.Timer;
import com.revature.util.operators.BooleanOperator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T54AnagramTest {
	Q54Anagram sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q54Anagram();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void NotNull() {
		assertNotNull(sut);
	}

	@Test
	public void areAnagramsMaryNull() {
		assertFalse(sut.execute("Mary", null));
	}

	@Test
	public void areAnagramsNullarmy() {
		assertFalse(sut.execute(null, "army"));
	}

	@Test
	public void areAnagramsNullNull() {
		assertFalse(sut.execute(null, null));
	}

	@Test
	public void areAnagramsMismatchLengths() {
		assertFalse(sut.execute("ary", "army"));
	}

	@Test
	public void areAnagramsMaryarmy() {
		assertTrue(sut.execute("Mary", "army"));
	}

	@Test
	public void areAnagramsMmmmMmmm() {
		assertTrue(sut.execute("Mmmm", "mmMm"));
	}

	@Test
	public void areAnagramsMaryArmyCaseSensitive() {
		sut.caseSensitive = true;
		assertFalse(sut.execute("Mary", "army", "CaseSensitive"));
	}

	@Test
	public void areAnagramsExhaustive() {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		for (int j = 0; j < 1000; j++) {
			for (char i = 'a'; i <= 'z'; i++) {
				s1.append(i);
				s2.append((char)(219 - i));
			}
		}
		Timer.printTime(sut, s1.toString(), s2.toString(), "Sort");
		Timer.printTime(sut, s1.toString(), s2.toString(), "Erode");
		Timer.printTime(sut, s1.toString(), s2.toString(), "ErodeLL");
		assertTrue(sut.execute(s1.toString(), s2.toString()));
	}

	@Test
	public void areAnagramsMaryarMyCaseSensitive() {
		sut.caseSensitive = true;
		assertTrue(sut.execute("Mary", "arMy"));
	}
}
