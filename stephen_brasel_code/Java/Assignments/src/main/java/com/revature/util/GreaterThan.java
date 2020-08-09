package com.revature.util;

public class GreaterThan implements IntCommand{
	@Override
	public boolean execute(Integer o1, Integer o2) {
		return o1 > o2;
	}
}
