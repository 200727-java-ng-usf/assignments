package com.revature.questions;

import org.junit.*;
import org.junit.rules.Timeout;
import org.junit.runners.model.TestTimedOutException;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class T32NumberOfIslandsTest {
	Q32NumberOfIslands sut;

	@Rule
	public Timeout globalTimeout = new Timeout(3000, TimeUnit.MILLISECONDS);

	@Before
	public void setUp() throws Exception {
		sut = new Q32NumberOfIslands();
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
	}

	@Test
	public void numIslandsnull() {
		char[][] input = null;
		assertEquals(0, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2EmptyFirstOrder() {
		char[][] input = {
		};
		assertEquals(0, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2EmptySecondOrder() {
		char[][] input = {
				{},
				{}
		};
		assertEquals(0, sut.numIslands(input));
	}

	@Test
	public void numIslandsTestCase() {
		char[][] input = {
				{'1', '1', '1', '1', '0'},
				{'1', '1', '0', '1', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		assertEquals(1, sut.numIslands(input));
	}

	@Test
	public void numIslandsTestCaseSpiral() {
		char[][] input = {
				{'1', '0', '1', '1', '1'},
				{'1', '0', '0', '0', '1'},
				{'1', '0', '1', '0', '1'},
				{'1', '0', '0', '0', '1'},
				{'1', '1', '1', '1', '1'}
		};
		assertEquals(2, sut.numIslands(input));
	}

	@Test
	public void numIslands3x3() {
		char[][] input = {
				{'0', '0', '0'},
				{'0', '1', '0'},
				{'0', '0', '0'},
		};
		assertEquals(1, sut.numIslands(input));
	}

	@Test
	public void numIslands3x35() {
		char[][] input = {
				{'1', '0', '1'},
				{'0', '1', '0'},
				{'1', '0', '1'},
		};
		assertEquals(5, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2UpperLeft() {
		char[][] input = {
				{'1', '0'},
				{'0', '0'}
		};
		assertEquals(1, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2UpperRight() {
		char[][] input = {
				{'0', '1'},
				{'0', '0'}
		};
		assertEquals(1, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2LowerLeft() {
		char[][] input = {
				{'0', '0'},
				{'1', '0'}
		};
		assertEquals(1, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2LowerRight() {
		char[][] input = {
				{'0', '0'},
				{'0', '1'}
		};
		assertEquals(1, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2Diag430() {
		char[][] input = {
				{'1', '0'},
				{'0', '1'}
		};
		assertEquals(2, sut.numIslands(input));
	}

	@Test
	public void numIslands2x2Diag730() {
		char[][] input = {
				{'0', '1'},
				{'1', '0'}
		};
		assertEquals(2, sut.numIslands(input));
	}
}