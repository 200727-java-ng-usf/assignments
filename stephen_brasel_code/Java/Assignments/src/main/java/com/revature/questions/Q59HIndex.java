package com.revature.questions;

import java.util.Arrays;

public class Q59HIndex {
	/**
	 * In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:
	 * A researcher has index h if at least h of her N papers have h citations each. If there are multiple h satisfying this formula, the maximum is chosen.
	 * For example, suppose N = 5, and the respective citations of each paper are [4, 3, 0, 1, 5]. Then the h-index would be 3, since the researcher has 3 papers with at least 3 citations.
	 * Given a list of paper citations of a researcher, calculate their h-index.
	 * @param ar
	 * @return
	 */
	public int hIndex(int[] ar) {
		if(ar == null || ar.length == 0) return 0;
		int[] sorted = Arrays.stream(ar).sorted().toArray();
		int i = 0, len = ar.length;
		for (; i < len-1; i++)
			if(sorted[i+1] > len - i) break;
		return Math.min(sorted[i], len);
	}
}
