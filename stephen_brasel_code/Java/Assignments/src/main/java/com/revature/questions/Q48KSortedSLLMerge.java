package com.revature.questions;

import java.util.*;

public class Q48KSortedSLLMerge {
	/**
	* Takes in a list of pre-sorted linkedlists of integers
	* and returns a sorted merged linkedlist containing all elements of
	* all of the linkedlists in sorted order.
	 */
	public List<Integer> mergeLists(List<LinkedList<Integer>> lists){
		if(lists == null || lists.isEmpty()) return new LinkedList<>();
		else if(lists.size() == 1) return lists.get(0);

		LinkedList<Integer> ret = new LinkedList<>();
		int i, pickedIndex, min, currVal, countDone = 0
				, numLists = lists.size();
		int[] indices = new int[numLists];

		while(true) {
			min = Integer.MAX_VALUE;
			for (i = pickedIndex = countDone = 0; i < numLists; i++) {
				if (indices[i] >= lists.get(i).size()) {
					if (++countDone >= numLists) return ret;
				}
				else {
					currVal = lists.get(i).get(indices[i]);
					if (min > currVal) {
						min = currVal;
						pickedIndex = i;
					}
				}
			}
			ret.add(min);
			indices[pickedIndex] += 1;
		}
	}
}
