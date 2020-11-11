package com.revature.questions;

import java.util.Arrays;

public class Q33SortByHeight {
	public int[] sortByHeight(int[] arr, int[] keys) {
		//check for edge cases
		if (arr == null || arr.length == 0) return new int[0];
		//make a copy of the original array, this copy will be sorted instead of the original
		int[] copy = Arrays.copyOf(arr, arr.length);
		boolean sorted, end;
		int i = 0, temp = 0, offset = 1;
		do {
			sorted = true;
			end = false;
			innerloop :
			for (i = 0; i < copy.length - 1; i++) {
				//skipping
				if (Arrays.binarySearch(keys, copy[i]) == -1) continue;
				offset = 1;
				while(Arrays.binarySearch(keys, copy[i + offset]) > -1){
					offset++;
					if(i + offset >= copy.length){
						end = true;
						break;
					}
				}
				//sorting
				if (!end && copy[i] > copy[i + offset]) {
					//swap
					temp = copy[i];
					copy[i] = copy[i + offset];
					copy[i + offset] = temp;
					//set check
					sorted = false;
				}
			}
		} while (!sorted);
		return copy;
	}
}
