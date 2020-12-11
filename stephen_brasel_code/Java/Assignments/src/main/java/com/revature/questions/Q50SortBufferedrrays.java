package com.revature.questions;

import java.util.Arrays;

public class Q50SortBufferedrrays {
	public void sort(Integer[] target, Integer[] source){
		if(target == null || source == null
				|| target.length == 0 || source.length == 0) return;
		int t = 0, s = source.length - 1;
		for (t = target.length - source.length; t >= 0; t--)
			if(target[t] != null) break;
		for (int i = t+source.length; i >= 0; i--) {
			target[i] = (t < 0 || (s >= 0 && source[s] > target[t]))
					? source[s--]
					: target[t--];
		}
	}
}
