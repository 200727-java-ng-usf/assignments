package com.revature.parameterized_test.tests;

import com.revature.questions.Q50SortBufferedrrays;
import com.revature.questions.Q9PrimeNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class T50SortBufferedArraysTester {
	private Q50SortBufferedrrays sut;
	private Integer[] target;
	private Integer[] source;
	private Integer[] expected;

	public T50SortBufferedArraysTester(Integer[][] input, Integer[] expected){
		this.target = input[0];
		this.source = input[1];
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers(){
		return Arrays.asList(new Object[][]{
				{new Integer[][]{
						new Integer[]{},
						new Integer[]{}},
						new Integer[]{}}
				,{new Integer[][]{
				new Integer[]{1, null},
				new Integer[]{1}},
				new Integer[]{1,1}}
				,{new Integer[][]{
				new Integer[]{1, 1, null},
				new Integer[]{1}},
				new Integer[]{1, 1, 1}}
				,{new Integer[][]{
				new Integer[]{1, 2, null},
				new Integer[]{1}},
				new Integer[]{1, 1, 2}}
				,{new Integer[][]{
				new Integer[]{1, null, null},
				new Integer[]{1, 2}},
				new Integer[]{1, 1, 2}}
				,{new Integer[][]{
				new Integer[]{1, 2, null, null},
				new Integer[]{1, 2}},
				new Integer[]{1, 1, 2, 2}}
				,{new Integer[][]{
				new Integer[]{1, 2, 3, null, null},
				new Integer[]{1, 2}},
				new Integer[]{1, 1, 2, 2, 3}}
				,{new Integer[][]{
				new Integer[]{1, 2, 3, 5, null, null, null, null},
				new Integer[]{2, 3, 4 , 5}},
				new Integer[]{1, 2, 2, 3, 3, 4, 5, 5}}
				,{new Integer[][]{
				new Integer[]{1, null},
				new Integer[]{2}},
				new Integer[]{1, 2}}
				,{new Integer[][]{
				new Integer[]{1, 2, 3, 5, null, null, null, null},
				new Integer[]{2}},
				new Integer[]{1, 2, 2, 3, 5, null, null, null}}
				,{new Integer[][]{
				new Integer[]{1, 2, 3, 4, null, null, null, null},
				new Integer[]{1, 2, 3}},
				new Integer[]{1, 1, 2, 2, 3, 3, 4, null}}
				,{new Integer[][]{
				new Integer[]{2, 4 ,6, 8, null, null, null, null},
				new Integer[]{1, 3, 5, 7}},
				new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}}
				,{new Integer[][]{
				new Integer[]{5, 6, 7, 8, null, null, null, null},
				new Integer[]{1, 2, 3, 4}},
				new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}}
		});
	}

	@Before
	public void t9Setup(){
		sut = new Q50SortBufferedrrays();
	}

	@After
	public void t9Teardown(){
		sut = null;
	}

	@Test
	public void t9PrimeZero(){
		System.out.println("Target: " + Arrays.toString(target) + "\nSource: " + Arrays.toString(source));
		sut.sort(target, source);
		assertArrayEquals(expected, target);
	}
}
