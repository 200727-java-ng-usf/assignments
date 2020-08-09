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
	private final ByteArrayInputStream inContent = new ByteArrayInputStream(buffer);
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private final InputStream originalIn = System.in;

	@Before
	public void t9Setup() {
		q17 = new Q17PrincipalInvesting();
	}

	@After
	public void t9TearDown(){

	}

	//region UTILITYTESTS
	@Test
	public void t9NotNull(){
		assertNotNull(q17);
	}
	//endregion

	//region POSITIVE_TESTS
	@Test
	public void t17PrincipalInvesting() {
		double result = (q17.getInterest(100.0d, 0.07d, 2));
		assertEquals(14, result, 0.001D);
	}
//	@Test
//	public void t17PrincipalInvestingUserInput() throws InputMismatchException {
//		PrintStream out = new PrintStream(outContent);
//
//
//		double result = (q17.UserEntry(inContent, System.out, 100.0d, 2.0d, 2.0d));
//		assertEquals(14, result, 0.001D);
//
//		System.setOut(originalOut);
//	}
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

	//endregion

}
