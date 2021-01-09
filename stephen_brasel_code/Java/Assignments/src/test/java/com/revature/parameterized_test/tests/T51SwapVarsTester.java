package com.revature.parameterized_test.tests;

import com.revature.questions.Q51SwapVars;
import com.revature.questions.Q9PrimeNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class T51SwapVarsTester {
	@Rule
	public TestName name = new TestName();
	private Q51SwapVars sut;
	private int[][] input;
	private int[][] expected;
	private int[][] initInput;

	public T51SwapVarsTester(int[][] input, int[][] expectedResult){
		this.input = input;
		this.expected = expectedResult;
		initInput = Arrays.copyOf(input, input.length);
		for (int i = 0; i < input.length; i++) {
			initInput[i] = Arrays.copyOf(input[i], input[i].length);
		}
	}

	@Parameterized.Parameters
	public static Collection primeNumbers(){
		return Arrays.asList(new Object[][]{
				{ new int[][] {
						new int[] {10},
						new int[] {5}
				}, new int[][] {
						new int[] {5},
						new int[] {10}
				}}
				,{ new int[][] {
				new int[]{0},
				new int[]{1}
		}, new int[][]{
				new int[]{1},
				new int[]{0}
		}}
				,{ new int[][] {
				new int[]{1},
				new int[]{0}
		}, new int[][]{
				new int[]{0},
				new int[]{1}
		}}
				,{ new int[][] {
				new int[]{Integer.MAX_VALUE},
				new int[]{Integer.MIN_VALUE}
		}, new int[][]{
				new int[]{Integer.MIN_VALUE},
				new int[]{Integer.MAX_VALUE}
		}}
				,{ new int[][] {
				new int[]{Integer.MIN_VALUE},
				new int[]{Integer.MAX_VALUE}
		}, new int[][]{
				new int[]{Integer.MAX_VALUE},
				new int[]{Integer.MIN_VALUE}
		}}
		});
	}

	@Before
	public void setup(){
		sut = new Q51SwapVars();
		input = initInput;
		System.out.println("" + name.getMethodName() + " Input is: "
				+ Arrays.toString(input[0]) + ", " + Arrays.toString(input[1]));
	}

	@After
	public void tearDown() throws Exception {
		sut = null;
		input = null;
	}

	@Test
	public void swapTemp(){
		sut.swapTemp(input[0], input[1]);
		assertArrayEquals(expected[0], input[0]);
		assertArrayEquals(expected[1], input[1]);
	}

	@Test
	public void swapZero(){
		sut.swapZero(input[0], input[1]);
		assertArrayEquals(expected[0], input[0]);
		assertArrayEquals(expected[1], input[1]);
	}

	@Test
	public void swapAdditive(){
		sut.swapAdditive(input[0], input[1]);
		assertArrayEquals(expected[0], input[0]);
		assertArrayEquals(expected[1], input[1]);
	}

	@Test
	public void swapMultiplicative(){
		try{
			Math.multiplyExact(input[0][0], input[1][0]);
		} catch(ArithmeticException e) {
			System.out.println("" + name.getMethodName() + " Input is: "
					+ Arrays.toString(input[0]) + ", " + Arrays.toString(input[1]));
			e.printStackTrace();
			return;
		}
		sut.swapMultiplicative(input[0], input[1]);
		assertArrayEquals(expected[0], input[0]);
		assertArrayEquals(expected[1], input[1]);
	}

	@Test
	public void swapXOR(){
		sut.swapXOR(input[0], input[1]);
		assertArrayEquals(expected[0], input[0]);
		assertArrayEquals(expected[1], input[1]);
	}
}
