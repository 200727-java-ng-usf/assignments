package com.revature.questions;

import java.util.Arrays;

public class Q43ModifyIncreasingArrays {
	/**
	 * if a is null, short-circuits the boolean check and returns true,
	 * 	the array is in ascending order.
	 * else if length of array is 1 or less, array is also guaranteed
	 * 	to be in ascending order.
	 * create variables i, count, and length. set length to a.length-1 to
	 * reduce calling those operations within the loop itself.
	 * the loop will continue while i is less than the array length - 1 to
	 * avoid ArrayOutOfBounds issues
	 * if an element is less than the pre-incremented element,
	 * 	short-circuit the boolean check and continue.
	 * else, the array is out of order.
	 * if out of order, pre-increment count and check if count
	 * is greater than 1. If so, this array cannot be modified
	 * within the parameters
	 * if all of the elements are in order, the array is already working.
	 *
	 * @param a
	 * @return true if the given array is one or zero adjustments away
	 * 			from being in ascending sorted order.
	 */
	public boolean isModifiableArray(int[] a) {
		if (a == null || a.length < 2) return true;
		for(int i = 0, count = 0, length = a.length - 1; i < length;)
			if (a[i] >= a[++i] && ++count > 1) return false;
		return true;
	}
}
