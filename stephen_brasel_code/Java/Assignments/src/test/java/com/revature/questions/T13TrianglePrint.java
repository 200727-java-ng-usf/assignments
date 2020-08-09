package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T13TrianglePrint {
	Q13TrianglePrint q13;
	String res = "0\r\n" +
			"1 0\r\n" +
			"1 0 1\r\n" +
			"0 1 0 1\r\n";
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void t13Setup() {
		q13 = new Q13TrianglePrint();
	}

	@After
	public void t13TearDown() {
		q13 = null;
	}

	//region UTILITYTESTS
	@Test
	public void t13NotNull() {
		assertNotNull(q13);
	}
	//endregion

	//region POSITIVE_TESTS


	/**
	 * System.out
	 */
	@Test
	public void t13TrianglePoint(){
		String[] strs = q13.triWhile(4);
		for (String str : strs) {
			Q13TrianglePrint.printSpacedOutStr(str);
		}
		assertArrayEquals(new String[]{"0", "10", "101", "0101"}, strs);
	}

	@Test
	public void t13EnhancedForPrinted() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		String[] strs = q13.triWhile(4);
		for (String str : strs) {
			System.out.println(Q13TrianglePrint.printSpacedOutStr(str));
		}
		assertEquals(res, outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
		for (String str : strs) {
			Q13TrianglePrint.printSpacedOutStr(str);
		}
	}
	//endregion

	//region NEGATIVE_TESTS_TESTS
	@Test
	public void t13Negative() {
		assertArrayEquals(new String[]{}, q13.triWhile(Integer.MIN_VALUE));
	}
	@Test
	public void t13Zero() {
		assertArrayEquals(new String[]{}, q13.triWhile(0));
	}

	//endregion

}
