package com.revature.questions;

import java.util.Arrays;

public class Q30LargestIntegerConcat {

	/**
	 * Given an array of Integers, creates the largest possible Long
	 * e.g.:
	 * given [0, 1, 0], creates 100
	 * given [5, 56, 55, 54] creates 5655554
	 * @param ar
	 * @return the largest possible Long given the combination of the given Integers
	 */
	public long concatLargestInt(Integer[] ar){
		if(ar == null || ar.length == 0) return 0;
		Arrays.sort(ar, (e1, e2) -> {
			String v1 = e1.toString();
			String v2 = e2.toString();
			int len1 = v1.length();
			int len2 = v2.length();
			int lim = Math.max(len1--, len2--);
			for (int i = 0; i < lim; i++) {
				char c1 = v1.charAt(Math.min(i, len1));
				char c2 = v2.charAt(Math.min(i, len2));
				if (c1 != c2) {
					return c2 - c1;
				}
			}
			return 0;
		});
		StringBuilder stb = new StringBuilder();
		for (Integer integer : ar) {
			stb.append(integer);
		}
		return Long.parseLong(stb.toString());
	}

}
