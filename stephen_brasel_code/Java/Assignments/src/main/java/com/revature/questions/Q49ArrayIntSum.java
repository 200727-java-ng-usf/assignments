package com.revature.questions;

import java.util.Arrays;

public class Q49ArrayIntSum {
	public boolean canSum(int[] ar, int k){
		if(ar == null || ar.length == 0) return false;
		Arrays.sort(ar);
		for (int i = 0, j = ar.length-1, sum; i < j;) {
			sum = ar[i] + ar[j];
			if(sum > k) j--;
			else if (sum < k) i++;
			else return true;
		}
		return false;
	}
}
