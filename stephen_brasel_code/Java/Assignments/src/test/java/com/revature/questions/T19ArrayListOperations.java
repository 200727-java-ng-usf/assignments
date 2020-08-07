package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T19ArrayListOperations {
	Q19ArrayListOperations q19;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void t19setupTest() {
		q19 = new Q19ArrayListOperations(10);
	}

	@After
	public void t19tearDownTest(){
		System.out.println();
	}

	//region UTILITYTESTS
	@Test
	public void t19NotNull(){
		assertNotNull(q19);
	}
	//endregion

	//region POSITIVE
	@Test
	public void t19Evens(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		System.out.print(q19.getEvens());
		assertEquals("20", outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
		System.out.print(q19.getEvens());
	}
	@Test
	public void t19Odds(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		System.out.print(q19.getOdds());
		assertEquals("25", outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
		System.out.print(q19.getOdds());
	}
	@Test
	public void t19NonPrimes(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		System.out.print(q19.returnNONPrimes());
		assertEquals("[0, 1, 4, 6, 8, 9]", outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
		System.out.print(q19.returnNONPrimes());
	}
	//endregion

	//region NEGATIVE
	@Test
	public void t19setupTestNegInts() {
		Random rand = new Random();
		rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
		int count = rand.nextInt() % 1000;
		q19 = new Q19ArrayListOperations(count);
		assertEquals(count, q19.getInts().size());
		System.out.println(String.format("%d, %d", count, q19.getInts().size()));
	}

	//endregion

}
