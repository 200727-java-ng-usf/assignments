package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TPrimitiveOperatorsTest {
	QPrimitiveOperators sut;

	@Before
	public void setUp() throws Exception {
		sut = new QPrimitiveOperators();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void testboolean() {
		sut.testboolean(true);
	}

	@Test
	public void testBoolean() {
		sut.testBoolean(true);
	}

	@Test
	public void testchar() {
		sut.testchar('A');
	}

	@Test
	public void testCharacter() {
		sut.testCharacter('A');
	}

	@Test
	public void testString() {
		sut.testString("Str");
	}

	@Test
	public void testshort() {
		sut.testshort((short) 1);
	}

	@Test
	public void testShort() {
		sut.testShort((short) 1);
	}

	@Test
	public void testbyte() {
		sut.testbyte((byte)1);
	}

	@Test
	public void testByte() {
		sut.testByte((byte)1);
	}

	@Test
	public void testint() {
		sut.testint(1);
	}

	@Test
	public void testInteger() {
		sut.testInteger(1);
	}

	@Test
	public void testlong() {
		sut.testlong(1l);
	}

	@Test
	public void testLong() {
		sut.testLong(1l);
	}

	@Test
	public void testfloat() {
		sut.testfloat(1.0f);
	}

	@Test
	public void testFloat() {
		sut.testFloat(1.0f);
	}

	@Test
	public void testdouble() {
		sut.testdouble(1.0);
	}

	@Test
	public void testDouble() {
		sut.testDouble(1.0);
	}
}