package com.revature.util;

import com.revature.util.operators.BooleanOperator;
import com.revature.util.operators.Operator;
import com.revature.util.operators.VoidOperator;

public class Timer {
	public static long time(VoidOperator v, Object... args){
		final long startTime = System.currentTimeMillis();
		v.execute(args);
		return (System.currentTimeMillis() - startTime);
	}

	public static long time(BooleanOperator b, Object... args){
		final long startTime = System.currentTimeMillis();
		b.execute(args);
		return (System.currentTimeMillis() - startTime);
	}


	public static void printTime(Operator v, Object... args){
		System.out.println(v.getClass().getName());
		switch (v.getClass().getName()){
			default:
				break;
			case "VoidOperator":
				System.out.println("Total Execution Time: " + time((VoidOperator) v, args));
				break;
			case "BooleanOperator":
			case "com.revature.questions.Q54Anagram":
				System.out.println("Total Execution Time: " + time((BooleanOperator) v, args));
				break;
		}
	}
}
