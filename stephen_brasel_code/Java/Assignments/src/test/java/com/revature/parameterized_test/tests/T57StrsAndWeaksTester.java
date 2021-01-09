package com.revature.parameterized_test.tests;

import com.revature.questions.Q57StrsAndWeaks;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class T57StrsAndWeaksTester {
	private Q57StrsAndWeaks sut;
	private Integer[] input;
	private String expectedResult;

	public T57StrsAndWeaksTester(Integer[] input, String expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection PlayersAndResults() {
		return Arrays.asList(new Object[][]{
				{new Integer[]{0, 0, 3}, "TIE"}
				,{new Integer[]{0, 1, 3}, "Player 2 wins"}
				,{new Integer[]{0, 2, 3}, "Player 1 wins"}
				,{new Integer[]{1, 1, 3}, "TIE"}
				,{new Integer[]{1, 2, 3}, "Player 2 wins"}
				,{new Integer[]{2, 2, 3}, "TIE"}
				,{new Integer[]{0, 0, 5}, "TIE"}
				,{new Integer[]{0, 1, 5}, "Player 2 wins"}
				,{new Integer[]{0, 2, 5}, "Player 1 wins"}
				,{new Integer[]{0, 4, 5}, "Player 1 wins"}
				,{new Integer[]{0, 3, 5}, "Player 2 wins"}
				,{new Integer[]{1, 1, 5}, "TIE"}
				,{new Integer[]{1, 2, 5}, "Player 2 wins"}
				,{new Integer[]{1, 4, 5}, "Player 2 wins"}
				,{new Integer[]{1, 3, 5}, "Player 1 wins"}
				,{new Integer[]{2, 2, 5}, "TIE"}
				,{new Integer[]{2, 4, 5}, "Player 1 wins"}
				,{new Integer[]{2, 3, 5}, "Player 2 wins"}
				,{new Integer[]{4, 4, 5}, "TIE"}
				,{new Integer[]{4, 3, 5}, "Player 1 wins"}
				,{new Integer[]{3, 3, 5}, "TIE"}
		});
	}

	@Before
	public void t55Setup(){
		sut = new Q57StrsAndWeaks();
	}
	@Test
	public void T57StrsAndWeaks(){
		String result = sut.play(input[0], input[1], input[2]);
		System.out.println("Play Parameters are: " + Arrays.toString(input) + "\t" + result);
		assertEquals(expectedResult, result);
	}
}
