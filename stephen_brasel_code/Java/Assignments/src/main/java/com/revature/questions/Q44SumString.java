package com.revature.questions;

import java.util.regex.*;

public class Q44SumString {
	public int sumInternalString(String s){
		if(s == null || s.length() == 0) return 0;
		Matcher matcher = Pattern.compile("(\\d)+").matcher(s);
		int sum = 0;
		while(matcher.find())
			sum += Integer.parseInt(matcher.group());
		return sum;
	}
}
