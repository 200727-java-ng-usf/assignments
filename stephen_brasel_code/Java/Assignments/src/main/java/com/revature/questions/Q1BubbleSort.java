package com.revature.questions;

import com.revature.util.GreaterThan;
import com.revature.util.IntCommand;

import java.util.Arrays;

public class Q1BubbleSort {
	//    Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
	IntCommand comparison;

	public void setComparison(IntCommand comparison) {
		this.comparison = comparison;
	}

	public Q1BubbleSort() {
		comparison = new GreaterThan();
	}

//    public Q1BubbleSort(IntCommand comparison) {
//        this.comparison = comparison;
//    }

//	public boolean callCommand(IntCommand c, int i1, int i2) {
//		return c.execute(i1, i2);
//	}

	public int[] bubbleSort(int[] arr) {
		//check for edge cases
		if (arr == null || arr.length == 0) return new int[0];
		//make a copy of the original array, this copy will be sorted instead of the original
		int[] copy = Arrays.copyOf(arr, arr.length);
		boolean sorted;
		int i = 0, temp = 0, n = copy.length;
		do {
			sorted = true;
			for (i = 0; i < n - 1; i++) {
//                if (copy[i] > copy[i + 1]) {
				if (comparison.execute(copy[i], copy[i + 1])) {
					//swap
					temp = copy[i];
					copy[i] = copy[i + 1];
					copy[i + 1] = temp;
					//set check
					sorted = false;
				}
			}
		} while (!sorted);
		return copy;
	}
}


