package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T16NumChars {
	Q16NumChars q16;
	Random rand;
	int maxSize = 100;
	byte[] buffer = new byte[maxSize];
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private InputStream inContent = new ByteArrayInputStream(buffer);
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private final InputStream originalIn = System.in;

	@Before
	public void t16Setup() {
		q16 = new Q16NumChars();
		rand = new Random();
		rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void t16TearDown(){
		q16 = null;
		System.setOut(originalOut);
		System.setErr(originalErr);
		System.setIn(originalIn);

	}

	//region UTILITYTESTS
	@Test
	public void t16NotNull(){
		assertNotNull(q16);
	}
	//endregion

	//region POSITIVE_TESTS
	/**
	 * System.in
	 * System.out
	 */
	@Test
	public void t16NumChars() throws IOException {
		PrintStream out = new PrintStream(outContent);
		System.setOut(out);
		System.setErr(new PrintStream(errContent));
		System.setIn(inContent);
		Scanner keyboard = new Scanner(inContent);

		int index, i, count = rand.nextInt() % maxSize;
		count = count < 0 ? -count : count;
		count += 10;									// at least 10 chars
		StringBuffer strb = new StringBuffer();
		for (i = 0; i < count; i++) {
			index = (rand.nextInt() % 26); 				//alphabetical range
			index = index < 0 ? -index : index;
			index += 97; 								// letters
			if(rand.nextInt()%2==0) index -= 32; 		//Capitals.
			char c = (char)index;
			strb.append(c);
		}
		Q16NumChars.main(new String[]{strb.toString()});
//		out.print(strb.toString());
//		Q16NumChars.main(new String[]{
//				keyboard.nextLine()
//		});
		assertEquals(Integer.toString(count), outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
		System.setIn(originalIn);

		System.out.println(count + ", " + Q16NumChars.getLen());
	}
	@Test
	public void t16NumCharsNo(){
		Q16NumChars.main(new String[]{});
		System.out.print(0 + ", " + Q16NumChars.getLen());
		assertEquals(0, Q16NumChars.getLen());
	}
	//endregion

	//region NEGATIVE_TESTS

	//endregion

}
