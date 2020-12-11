package com.revature.questions;

import java.util.Arrays;

public class Q35SimilarArrays {
	public boolean areSimilarCount(int[] a, int[] b) {
		if (a == null || b == null
				|| a.length != b.length || a.length == 0)
			return false;
		else if(Arrays.equals(a, b)) return true;
		int swapA = 0, swapB = 0, count = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] != b[i]) {
				if(count == 0){
					swapA = a[i];
					swapB = b[i];
				}
				if((count == 1 && (a[i] != swapB || b[i] != swapA))
						|| ++count > 2)
					return false;
			}
		}
		return (count & 1) == 0;
	}

	public boolean areSimilarSwap(int[] a, int[] b) {
		if (a == null || b == null
				|| a.length != b.length || a.length == 0)
			return false;
		else if(Arrays.equals(a, b)) return true;
		boolean valuesStored = false;
		int aVal = 0, index = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] != b[i]) {
				if(!valuesStored) {
					aVal = a[i];
					index = i;
					valuesStored = true;
				} else {
					int temp = a[i];
					a[i] = aVal;
					a[index] = temp;
					break;
				}
			}
		}
		return Arrays.equals(a, b);
	}
}
