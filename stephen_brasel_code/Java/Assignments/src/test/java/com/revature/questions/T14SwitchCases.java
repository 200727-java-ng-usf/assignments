package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Random;

import static java.time.LocalDateTime.now;
import static org.junit.Assert.*;

public class T14SwitchCases {
	Q14SwitchCases q14;
	String res = "0\r\n" +
			"1 0\r\n" +
			"1 0 1\r\n" +
			"0 1 0 1\r\n";
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	Random rand;

	@Before
	public void t14Setup() {
		q14 = new Q14SwitchCases();
		rand = new Random();
		rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
	}

	@After
	public void t14TearDown() {
		q14 = null;
	}

	//region UTILITYTESTS
	@Test
	public void t14NotNull() {
		assertNotNull(q14);
	}
	//endregion

	//region POSITIVE_TESTS


	/**
	 * System.out
	 */
	@Test
	public void t14SwitchCasesSqrt(){
		long x = rand.nextLong();
		x = x < 0 ? -x : x;
		q14.setSqrnum(x);
		q14.switcher(1);
		assertEquals(q14.getSqrrt(), Math.sqrt(x), 0.001F);
	}

	@Test
	public void t14SwitchCasesDate(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		q14.switcher(2);
//		assertEquals(now().toLocalDate().toString(), q14.getToday().toString());
		assertEquals(now().toLocalDate().toString(), outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	public void t14SwitchCasesSplit(){
		String[] strs = {"hi", "tom", "I", "know", "right"};
		String sentence = "";
		for (int i = 0; i < strs.length; i++) {
			int index = rand.nextInt() % strs.length;
			index = index < 0 ? -index : index;

			//swap
			String temp = strs[i];
			strs[i] = strs[index];
			strs[index] = temp;
		}
		for (int i = 0; i < strs.length; i++) {
			sentence = sentence.concat(strs[i]);
			if(i < strs.length - 1){
				sentence = sentence.concat(" ");
			}
		}
		q14.setSplitter(sentence);
		q14.switcher(3);
		System.out.println(Arrays.toString(strs));
//		printStrArray(strs);

		System.out.println(Arrays.toString(q14.getSplits()));
//		printStrArray(q14.getSplits());
		assertArrayEquals(strs, q14.getSplits());
	}

	@Test
	public void t14SwitchCasesSplitGiven(){
		String[] strs = {"I", "am", "learning", "Core", "Java"};
		String sentence = "I am learning Core Java";
		q14.setSplitter(sentence);
		q14.switcher(3);
//		printStrArray(strs);

		System.out.println(Arrays.toString(q14.getSplits()));
//		printStrArray(q14.getSplits());
		assertArrayEquals(strs, q14.getSplits());
	}
	//endregion

	//region NEGATIVE_TESTS
	@Test
	public void t14Negative() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		int nextIndex = rand.nextInt();
		if(nextIndex >= 1 && nextIndex <= 3) nextIndex += 3;
		q14.switcher(nextIndex);
		assertEquals("This is supposed to do nothing.", outContent.toString());

		System.setOut(originalOut);
		System.setErr(originalErr);

		if(nextIndex >= 1 && nextIndex <= 3) nextIndex += 3;
		q14.switcher(nextIndex);
	}

	@Test
	public void t14NullString(){
		q14.setSplitter(null);
		q14.switcher(3);
		assertArrayEquals(new String[]{""}, q14.getSplits());
	}

	//endregion

}
