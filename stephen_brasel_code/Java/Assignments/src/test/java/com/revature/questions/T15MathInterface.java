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

public class T15MathInterface {
	Q15MathInterface q15;
	Random rand;

	@Before
	public void t15Setup() {
		q15 = new Q15MathInterface();
		rand = new Random();
		rand.setSeed(now().toEpochSecond(ZoneOffset.UTC));
	}

	@After
	public void t15TearDown(){
		q15 = null;
	}

	//region UTILITYTESTS
	@Test
	public void t15NotNull(){
		q15 = new Q15MathInterface();
		assertNotNull(q15);
	}
	//endregion

	//region POSITIVE_TESTS
	@Test
	public void t15MathInterfaceAdd() {
		double x = rand.nextDouble();
		double y = rand.nextDouble();
		double add = q15.add(x, y);
		System.out.print(
				"Added: " + add + "\n"
		);
		assertEquals(add, x+y, 0.001D);
	}
	@Test
	public void t15MathInterfaceSub() {
		double x = rand.nextDouble();
		double y = rand.nextDouble();
		double sub = q15.subtract(x, y);
		System.out.print(
				"Subtracted: " + sub + "\n"
		);
		assertEquals(sub, x-y, 0.001D);
	}
	@Test
	public void t15MathInterfaceMult() {
		double x = rand.nextDouble();
		double y = rand.nextDouble();
		double mul = q15.multiply(x, y);
		System.out.print(
				"Multiplied: " + mul + "\n"
		);
		assertEquals(mul, x*y, 0.001D);
	}
	@Test
	public void t15MathInterfaceDiv() throws ArithmeticException {
		double x = rand.nextDouble();
		double y = rand.nextDouble();
		if(Double.compare(y, 0.0D) == 0) y++;
		double div= q15.divide(x, y);
		System.out.print(
				"Divided: " + div + "\n"
		);
		assertEquals(div, x/y, 0.001D);
	}
	//endregion


	//region NEGATIVE_TESTS
	@Test(expected = ArithmeticException.class)
	public void t15MathInterfaceDivZero() throws ArithmeticException {
		double x = rand.nextDouble();
		double y = 0.0D;
		double div= q15.divide(x, y);
		System.out.print(
				"Divided: " + div + "\n"
		);
	}

	//endregion

}
