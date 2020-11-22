package com.revature.questions;

public class Q41ArrayConsecutiveMax {
	public int arrayMaxConsecutiveSum(int[] inputArray, int k) {
		if(inputArray == null || k <= 0) return 0;
		k = Math.min(k, inputArray.length);
		int max = 0;
		int len = inputArray.length - k + 1;
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += inputArray[j];
			}
			if(sum > max) max = sum;
		}
		return max;
	}
}
