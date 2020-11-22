package com.revature.questions;

public class Q40RemoveWhiteSpace {
	public String deleteWhitespaces(String inputStr) {
		return inputStr == null ? "" : inputStr.replaceAll("\\s+", "");
	}
}
