package com.revature.questions;

import java.util.*;

public class Q45NumberInSquares {
	public int numInSquares(int n, int x){
		if(n <= 0 || x <= 0 || x > n*n) return 0;
		int i = 0, count = 0;
		while (++i*i < x)
			if(x % i == 0 && x <= n*i) count+=2;
		return i*i == x ? count+1 : count;
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
