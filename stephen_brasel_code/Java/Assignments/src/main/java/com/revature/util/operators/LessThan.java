package com.revature.util.operators;

public class LessThan implements BooleanOperator {
	@Override
	public boolean execute(Object... o) {
		return (Integer)o[0] < (Integer) o[1];
	}
}
