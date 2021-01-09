package com.revature.parameterized_test.tests;

import com.revature.questions.Q55RectInCircle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class T55RectInCircleTester {
	Q55RectInCircle sut;
	private Integer[] input;
	private Boolean expectedResult;

	public T55RectInCircleTester(Integer[] input, Boolean expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection RectsAndRadii() {
		return Arrays.asList(new Object[][]{
				{new Integer[]{8,6,5}, true}
				,{new Integer[]{5,9,5}, false}
				,{new Integer[]{4,7,4}, false}
				,{new Integer[]{12,1,7}, true}
		});
	}

	@Before
	public void t55Setup(){
		sut = new Q55RectInCircle();
	}
	@Test
	public void t55RectInCircle(){
		System.out.println("Input Parameter is: " + Arrays.toString(input));
		assertEquals(expectedResult, sut.rectangleInCircle(input[0], input[1], input[2]));
	}
}
