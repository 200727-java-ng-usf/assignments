package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T40RemoveWhiteSpaceTest {
	Q40RemoveWhiteSpace sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q40RemoveWhiteSpace();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void deleteWhitespacesNotNull() {
		assertNotNull(sut);
	}

	@Test
	public void deleteWhitespacesNull() {
		assertEquals("", sut.deleteWhitespaces(null));
	}

	@Test
	public void deleteWhitespacesHi() {
		assertEquals("hi!", sut.deleteWhitespaces("\t\t  h i ! \r\n"));
	}
}