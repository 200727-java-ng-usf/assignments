package com.revature.parameterized_test;

import com.revature.parameterized_test.tests.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(
				T9PrimeTester.class,
				T50SortBufferedArraysTester.class,
				T51SwapVarsTester.class,
				T55RectInCircleTester.class,
				T56RockPaperScissorsLizardSpockTester.class,
				T57StrsAndWeaksTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}