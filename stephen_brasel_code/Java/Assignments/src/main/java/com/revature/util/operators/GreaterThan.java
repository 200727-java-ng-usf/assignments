package com.revature.util.operators;

public class GreaterThan implements BooleanOperator {
	@Override
	public boolean execute(Integer o1, Integer o2) {
		return o1 > o2;
	}
}
