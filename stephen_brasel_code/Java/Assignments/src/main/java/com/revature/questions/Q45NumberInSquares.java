package com.revature.questions;

import java.util.*;

public class Q45NumberInSquares {

	/**
	 * if either n or x is less than 0, return 0.
	 * if x is greater than n^2, it won't be in the square, return 0.
	 * look through all numbers i from 1 to the square root of x,
	 * 		if i is a factor of x and x divided by i is less than or
	 * 			equal to n, there are at least two additional places
	 * 			x is on the n-squared chart, due to the associative
	 * 			property: i*(x/i) and (x/i)*i.
	 * 	lastly, find out if the square root of x is whole.
	 * 		if it is, it appears one additional time on the diagonal
	 * 		of the n-square table.
	 * @param n
	 * @param x
	 * @return
	 */
	public int numInSquares(int n, int x){
		if(n <= 0 || x <= 0 || x > n*n) return 0;
		int i = 0, count = 0;
		while (++i*i < x)
			if(x % i == 0 && x <= n*i) count+=2;
		return i*i == x ? count+1 : count;
	}

	public int numInSquaresN(int n, int x){
		if(n <= 0 || x <= 0 || x > n*n) return 0;
		int count = 0;
		for (int i = 1; i <= n && i <= x; i++)
			if(x%i == 0 && x / i <= n) count++;
		return count;
	}

	public List<Integer> getFactors(int n){
		List<Integer> ret = new ArrayList<>();
		int i = 1, index = 0;
		for (; i*i < n; i++) {
			if(n % i == 0) {
				ret.add(index,n/i);
				ret.add(index++,i);
			}
		}
		if(i*i == n) ret.add(index, i);
		return ret;
	}
}
