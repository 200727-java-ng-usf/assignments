package com.revature.util;

import java.util.Comparator;

public class IntConcatComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer e1, Integer e2) {
		char[] v1 = e1.toString().toCharArray();
		char[] v2 = e2.toString().toCharArray();
		int len1 = v1.length;
		int len2 = v2.length;
		int lim = Math.max(len1, len2);
		len1--;
		len2--;
		int k = 0;
		while (k < lim) {
			char c1 = v1[Math.min(k, len1)];
			char c2 = v2[Math.min(k, len2)];
			if (c1 != c2) {
				return c2 - c1;
			}
			k++;
		}
		return 0;
	}
}
