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

public class T12EnhancedFor {
	Q12EnhancedFor q12;
	Random rand;
	String evens = "2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100";
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void t12setupTest() {
		q12 = new Q12EnhancedFor();
		rand = new Random();
		rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
	}

	@After
	public void t12tearDownTest() {
//		System.out.println();
	}

	//region UTILITYTESTS
	@Test
	public void t12PackageAccessNotNull() {
		assertNotNull(q12);
	}
	//endregion

	//region POSITIVE

	/**
	 * System.out
	 */
	@Test
	public void t12EnhancedFor() {
		q12.printEnhancedForEven();
		assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
						22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
						42, 44, 46, 48, 50, 52, 54, 56, 58, 60,
						62, 64, 66, 68, 70, 72, 74, 76, 78, 80,
						82, 84, 86, 88, 90, 92, 94, 96, 98, 100},
				q12.getArrEven()
		);
	}

	@Test
	public void t12EnhancedForPrinted() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		q12.printEnhancedForEven();
		assertEquals(evens, outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
	}
	//endregion

	//region NEGATIVE
	public void t12Negative() {

	}

	//endregion

}
