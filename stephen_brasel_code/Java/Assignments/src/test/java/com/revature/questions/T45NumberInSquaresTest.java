package com.revature.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class T45NumberInSquaresTest {
	Q45NumberInSquares sut;

	@Before
	public void setUp() throws Exception {
		sut = new Q45NumberInSquares();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void numInSquaresNotNull() {
		assertNotNull(sut);
	}

	@Test
	public void numInSquares01() {
		assertEquals(0, sut.numInSquares(0,10));
	}

	@Test
	public void numInSquares100() {
		assertEquals(0, sut.numInSquares(10,0));
	}

	@Test
	public void numInSquaresMinus11() {
		assertEquals(0, sut.numInSquares(-1,1));
	}

	@Test
	public void numInSquares1Minus1() {
		assertEquals(0, sut.numInSquares(1,-1));
	}

	@Test
	public void numInSquares25() {
		assertEquals(0, sut.numInSquares(2,5));
	}

	@Test
	public void numInSquares11() {
		assertEquals(1, sut.numInSquares(1,1));
	}

	@Test
	public void numInSquares64() {
		assertEquals(3, sut.numInSquares(6,4));
	}

	@Test
	public void numInSquares255() {
		assertEquals(2, sut.numInSquares(25,5));
	}

	@Test
	public void numInSquares525() {
		assertEquals(1, sut.numInSquares(5,25));
	}

	@Test
	public void numInSquares59() {
		assertEquals(1, sut.numInSquares(5,9));
	}

	@Test
	public void numInSquares612() {
		assertEquals(4, sut.numInSquares(6,12));
	}

	@Test
	public void numInSquares3030() {
		assertEquals(8, sut.numInSquares(30,30));
	}

	@Test
	public void numInSquares1112() {
		assertEquals(4, sut.numInSquares(11,12));
	}

	@Test
	public void numInSquares1212() {
		assertEquals(6, sut.numInSquares(12,12));
	}

	@Test
	public void numInSquares100000AllLogN(){
		int max = 0, num = 100000;
		for (int i = 0; i < num; i++) {
			int n = sut.numInSquares(num, i);
			if(max < n) {
				max = n;
				System.out.println(max + ": " + i);
			}
		}
	}

	@Test
	public void numInSquares100000AllN(){
		int max = 0, num = 100000;
		for (int i = 0; i < num; i++) {
			int n = sut.numInSquaresN(num, i);
			if(max < n) {
				max = n;
				System.out.println(max + ": " + i);
			}
		}
	}

	@Test
	public void numInSquaresFactors25() {
		assertArrayEquals(new Integer[]{1,5,25}, sut.getFactors(25).toArray());
	}

	@Test
	public void numInSquaresFactors30() {
		assertArrayEquals(new Integer[]{1,2,3,5,6,10,15,30}, sut.getFactors(30).toArray());
	}

	@Test
	public void numInSquaresFactors120() {
		assertArrayEquals(new Integer[]{1,2,3,4,5,6,8,10,12,15,20,24,30,40,60,120}, sut.getFactors(120).toArray());
	}
}