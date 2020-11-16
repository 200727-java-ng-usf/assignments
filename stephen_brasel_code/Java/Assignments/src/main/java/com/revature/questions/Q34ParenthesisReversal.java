package com.revature.questions;

public class Q34ParenthesisReversal {
	public String reverseInParentheses(String inputString) {
		if(inputString == null || inputString.length() == 0) return "";
		StringBuilder ret = new StringBuilder(inputString);
		int startIndex = -1, endIndex = 0;
		do {
			startIndex = endIndex = -1;
			for (int i = ret.length() - 1; i >= 0; i--) {
				if(ret.charAt(i) == '(') {
					startIndex = i;
					break;
				}
			}
			if(startIndex > -1){
				for (int i = startIndex; i < ret.length(); i++) {
					if(ret.charAt(i) == ')') {
						endIndex = i;
						break;
					}
				}
				ret.replace(startIndex, endIndex + 1, new StringBuilder(ret.substring(startIndex + 1, endIndex)).reverse().toString());
			}
		}while(startIndex > -1);
		return ret.toString();
	}
}
