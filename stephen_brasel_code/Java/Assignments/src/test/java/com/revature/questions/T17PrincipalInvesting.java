package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class T17PrincipalInvesting {
	Q17PrincipalInvesting q17;
	int maxSize = 100;
	byte[] buffer = new byte[maxSize];
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private InputStream inContent = new ByteArrayInputStream(buffer);
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private final InputStream originalIn = System.in;

	@Before
	public void t17Setup() {
		q17 = new Q17PrincipalInvesting();
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void t17TearDown() {
		q17 = null;
		System.setOut(originalOut);
		System.setErr(originalErr);
		System.setIn(originalIn);
	}

	@Test
	public void t17InputTest(){
		String s = "100.0d\n0.07d\n2";
		inContent = new ByteArrayInputStream(s.getBytes());
		System.setIn(inContent);

		double result = (q17.UserEntry());
		assertEquals(14, result, 0.001D);
	}

	//region UTILITYTESTS
	@Test
	public void t17NotNull() {
		assertNotNull(q17);
	}
	//endregion

	//region POSITIVE_TESTS
	@Test
	public void t17PrincipalInvesting() {
		double result = (q17.getInterest(100.0d, 0.07d, 2));
		assertEquals(14, result, 0.001D);
	}

	@Test
	public void t17PrincipalInvestingUserInput() {
		String s = "100.0d\n0.07d\n2";
		inContent = new ByteArrayInputStream(s.getBytes());
		System.setIn(inContent);

		double result = (q17.UserEntry());
		assertEquals(14, result, 0.001D);
	}
	//endregion

	//region NEGATIVE_TESTS
	@Test
	public void t17SOlutionUnequal() {
		double result = (q17.getInterest(100.0d, 0.07d, 2));
		assertNotEquals(140.0d, result, 0.001D);
	}

	@Test
	public void t17SolutionNegativePrincipal() {
		double result = (q17.getInterest(-100.0d, 0.07d, 2));
		assertEquals(0.0d, result, 0.001D);
	}

	@Test
	public void t17SolutionNegativeRate() {
		double result = (q17.getInterest(100.0d, -0.07d, 2));
		assertEquals(0.0d, result, 0.001D);
	}

	@Test
	public void t17SolutionNegativeTime() {
		double result = (q17.getInterest(100.0d, 0.07d, -2));
		assertEquals(0.0d, result, 0.001D);
	}

	@Test(expected = ArithmeticException.class)
	public void t17PrincipalInvestingMaxPos() {
		double result = (q17.getInterest(Double.MAX_VALUE, 1.1d, 1));
		System.out.println(result);
	}

	@Test
	public void t17PrincipalInvestingMaxNeg() {
		double result = (q17.getInterest(Double.MAX_VALUE, -1.1d, 1));
		System.out.println(result);
		assertEquals(0.0d, result, 0.001D);
	}
	@Test
	public void t17PIUserInputWrongPrincipal() {
		String s = "100.0dasd\n0.07d\n2";
		inContent = new ByteArrayInputStream(s.getBytes());
		System.setIn(inContent);

		double result = (q17.UserEntry());
		assertEquals("Enter principal: \r\n" +
				"Principal needs to be a double.", outContent.toString());
	}
	@Test
	public void t17PIUserInputWrongRate() {
		String s = "100.0d\n0.0Hi Wezley!7d\n2";
		inContent = new ByteArrayInputStream(s.getBytes());
		System.setIn(inContent);

		double result = (q17.UserEntry());
		assertEquals("Enter principal: \r\n" +
				"Enter rate: \r\n" +
				"Rate needs to be a double.", outContent.toString());
	}
	@Test
	public void t17PIUserInputWrongTime() {
		String s = "100.0d\n0.07d\n2123eds";
		inContent = new ByteArrayInputStream(s.getBytes());
		System.setIn(inContent);

		double result = (q17.UserEntry());
		assertEquals("Enter principal: \r\n" +
				"Enter rate: \r\n" +
				"Enter time in years: \r\n" +
				"Time in Years needs to be an int.", outContent.toString());
	}

	//endregion

}
