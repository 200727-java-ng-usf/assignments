package com.revature.util;

import com.revature.util.operators.VoidOperator;

public class Timer {
	public static long time(VoidOperator v){
		final long startTime = System.currentTimeMillis();
		v.execute();
		return (System.currentTimeMillis() - startTime);
	}


	public static void printTime(VoidOperator v){
		System.out.println("Total Execution Time: " + time(v));
	}
}
