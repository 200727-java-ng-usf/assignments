package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class T39RemoveDuplicatesTest {
	Q39RemoveDuplicates sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q39RemoveDuplicates();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void removeDuplicatesNull() {
		assertEquals(0, sut.removeDuplicates(null));
	}

	@Test
	public void removeDuplicatesEmpty() {
		int[] check =    new int[]{};
		int[] expected = new int[]{};
		assertEquals(0, sut.removeDuplicates(check));
		assertArrayEquals(expected, check);
	}

	@Test
	public void removeDuplicatesAllOnes() {
		int[] check =    new int[]{1, 1, 1, 1, 1, 1};
		int[] expected = new int[]{1};
		int resultLength = sut.removeDuplicates(check);
		assertEquals(expected.length, resultLength);
		System.out.println(Arrays.toString(check));
		assertArrayEquals(expected, Arrays.copyOf(check, resultLength));
	}

	@Test
	public void removeDuplicatesBeginning() {
		int[] check =    new int[]{1, 1, 2, 3, 4, 5};
		int[] expected = new int[]{1, 2, 3, 4, 5};
		int resultLength = sut.removeDuplicates(check);
		assertEquals(expected.length, resultLength);
		System.out.println(Arrays.toString(check));
		assertArrayEquals(expected, Arrays.copyOf(check, resultLength));
	}

	@Test
	public void removeDuplicatesEnd() {
		int[] check =    new int[]{1, 2, 3, 4, 5, 5};
		int[] expected = new int[]{1, 2, 3, 4, 5};
		int resultLength = sut.removeDuplicates(check);
		assertEquals(expected.length, resultLength);
		System.out.println(Arrays.toString(check));
		assertArrayEquals(expected, Arrays.copyOf(check, resultLength));
	}

	@Test
	public void removeDuplicatesAll() {
		int[] check =    new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] expected = new int[]{1, 2, 3, 4, 5};
		int resultLength = sut.removeDuplicates(check);
		assertEquals(expected.length, resultLength);
		System.out.println(Arrays.toString(check));
		assertArrayEquals(expected, Arrays.copyOf(check, resultLength));
	}

	@Test
	public void removeDuplicatesAllFront() {
		int[] check =    new int[]{1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] expected = new int[]{1, 2, 3, 4, 5};
		int resultLength = sut.removeDuplicates(check);
		assertEquals(expected.length, resultLength);
		System.out.println(Arrays.toString(check));
		assertArrayEquals(expected, Arrays.copyOf(check, resultLength));
	}
}