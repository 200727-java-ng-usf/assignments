package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T4Factorial {
	Q4Factorial q4;
	int[] result = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800};
	int facN = 39916800, n = 11;

	@Before
	public void t4Setup() {
		facN = 39916800;
		n = 11;
		q4 = new Q4Factorial();

	}

	@After
	public void t4TearDown() {
		q4 = null;
	}

	//region UTILITYTESTS
	@Test
	public void t4NotNull() {
//        Collections.shuffle(bubbles);
		assertNotNull(q4);
	}
	//endregion

	//region POSITIVE_TESTS
	@Test
	public void t4FactorialArray() {
		int n = 11;
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = q4.Factorial(i + 1);
			System.out.print(ar[i]);
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		assertArrayEquals(result, ar);
	}

	@Test
	public void t4FactorialSingular() {
		assertEquals(facN, q4.Factorial(n));
	}
	@Test
	public void t4FactorialForArray() {
		int n = 11;
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = q4.FactorialFor(i + 1);
			System.out.print(ar[i]);
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		assertArrayEquals(result, ar);
	}

	@Test
	public void t4FactorialForSingular() {
		assertEquals(facN, q4.FactorialFor(n));
	}
	@Test
	public void t4FactorialTailArray() {
		int n = 11;
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = q4.FactorialTail(i + 1);
			System.out.print(ar[i]);
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		assertArrayEquals(result, ar);
	}

	@Test
	public void t4FactorialTailSingular() {
		assertEquals(facN, q4.FactorialTail(n));
	}
	//endregion

	//region NEGATIVE_TESTS
	@Test
	public void t4FactorialSingularNotEqual() {
		assertNotEquals(n, q4.Factorial(n));
	}
	@Test
	public void t4FactorialZero() {
		assertEquals(1, q4.Factorial(0));
	}
	@Test
	public void t4FactorialNegative() {
		assertEquals(1, q4.Factorial(-1));
	}
	@Test
	public void t4FactorialForSingularNotEqual() {
		assertNotEquals(n, q4.FactorialFor(n));
	}
	@Test
	public void t4FactorialForZero() {
		assertEquals(1, q4.FactorialFor(0));
	}
	@Test
	public void t4FactorialForNegative() {
		assertEquals(1, q4.FactorialFor(-1));
	}
	@Test
	public void t4FactorialTailSingularNotEqual() {
		assertNotEquals(n, q4.FactorialTail(n));
	}
	@Test
	public void t4FactorialTailZero() {
		assertEquals(1, q4.FactorialTail(0));
	}
	@Test
	public void t4FactorialTailNegative() {
		assertEquals(1, q4.FactorialTail(-1));
	}
	//endregion

}
