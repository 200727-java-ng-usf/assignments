package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.ZoneOffset;
import java.util.Random;

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
	public void t13setupTest() {
		q13 = new Q13TrianglePrint();
	}

	@After
	public void t13tearDownTest() {
//		System.out.println();
	}

	//region UTILITYTESTS
	@Test
	public void t13PackageAccessNotNull() {
		assertNotNull(q13);
	}
	//endregion

	//region POSITIVE


	/**
	 * System.out
	 */
	@Test
	public void t13TrianglePoint(){
		String[] strs = q13.triWhile(4);
		for (String str : strs) {
			Q13TrianglePrint.printStr(str);
		}
		assertArrayEquals(new String[]{"0", "10", "101", "0101"}, strs);
	}

	@Test
	public void t13EnhancedForPrinted() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		String[] strs = q13.triWhile(4);
		for (String str : strs) {
			Q13TrianglePrint.printStr(str);
		}
		assertEquals(res, outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
		for (String str : strs) {
			Q13TrianglePrint.printStr(str);
		}
	}
	//endregion

	//region NEGATIVE
	public void t13Negative() {

	}

	//endregion

}
