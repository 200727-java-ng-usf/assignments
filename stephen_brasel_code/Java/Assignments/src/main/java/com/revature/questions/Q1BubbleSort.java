package com.revature.questions;

import com.revature.util.operators.GreaterThan;
import com.revature.util.operators.BooleanOperator;

import java.util.Arrays;

/**
 * A <code>Q1BubbleSort</code> sorts int[]s by comparison, default ascending order.
 * @author stephen.brasel@gmail.com
 */
public class Q1BubbleSort {
	//    Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
	/**
	 * an <code>{@link BooleanOperator}</code> implementation returning true or
	 * false depending on if a condition has been met.
	 * By default, this is set to an instance of <code>{@link GreaterThan}</code>,
	 * which sorts BubbleSort in ascending order
	 */
	private BooleanOperator comparison;

	/**
	 * Sets the comparison operator for sorting.
	 * @param comparison an <code>{@link BooleanOperator}</code> implementation returning true or
	 *                   false depending on if a condition has been met.
	 */
	public void setComparison(BooleanOperator comparison) {
		this.comparison = comparison;
	}

	/**
	 * By default, this sets the comparison operator to <code>{@link GreaterThan}</code>.
	 * This sorts BubbleSort in ascending order.
	 */
	public Q1BubbleSort() {
		comparison = new GreaterThan();
	}

//    public Q1BubbleSort(IntCommand comparison) {
//        this.comparison = comparison;
//    }

//	public boolean callCommand(IntCommand c, int i1, int i2) {
//		return c.execute(i1, i2);
//	}

	/**
	 * BubbleSort. This method copies the incoming array and returns a new, sorted int[].
	 * @param arr the incoming int[] to be sorted.
	 * @return a new int[]. If null is passed to the method, returns a new int[0].
	 */
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


