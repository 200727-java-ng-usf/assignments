package com.revature.questions;

public class Q31CyclicRotatingStrings {

	/**
	 * Return true if first string {a} is the
	 * cyclic rotated string of the second string {b}, e.g.
	 * given a = ABCD and b = CDAB, return true,
	 * given a = ABCD, and b = ACBD , return false
	 * @param a
	 * @param b
	 * @return true if
	 */
	public boolean isCyclicRotated(String a, String b){
		if(a == null || b == null || a.length() == 0 || b.length() == 0)
			return false;
		int max = Math.max(a.length(), b.length()) + 1
				, i = 0
				, offset = 0;

		while(i < max){
			if(a.charAt(i % a.length()) == b.charAt(0)){
				int j = offset;
				while(j < max + offset){
					if(a.charAt(j % a.length()) !=
							b.charAt((j - offset) % b.length())){
						break;
					}
					j++;
				}
				if(j == max + offset){ return true; }
			}
			offset = ++i; //increment both i and offset.
		}
		return false;
	}
}
