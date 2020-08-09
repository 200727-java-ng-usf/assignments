package com.revature.parameterized_test.tests;

import com.revature.questions.Q9PrimeNumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class T9PrimeTester {
	private Q9PrimeNumber q9;
	private Integer inputNumber;
	private Boolean expectedResult;

	public T9PrimeTester(Integer inputNumber, Boolean expectedResult){
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers(){
		return Arrays.asList(new Object[][]{
				{ Integer.MIN_VALUE, false}
				,{ -7, false}
				,{ 0, false}
				,{ 2, true }
				,{ 6, false }
				,{ 19, true }
				,{ 22, false }
				,{ 23, true }
				,{ 561, false}
				,{ Integer.MAX_VALUE, true}
		});
	}

	@Before
	public void t9Setup(){
		q9 = new Q9PrimeNumber(0);
	}
	@Test
	public void t9PrimeZero(){
		System.out.println("Parameterized Number is: " + inputNumber);
		assertEquals(expectedResult, Q9PrimeNumber.isPrime(inputNumber));
	}
}
