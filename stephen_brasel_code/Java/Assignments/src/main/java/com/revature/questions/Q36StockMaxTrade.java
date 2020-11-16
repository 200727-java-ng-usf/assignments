package com.revature.questions;

public class Q36StockMaxTrade {
	/**
	 * Finds the maximum singular transaction made from a list of integers
	 * representing consecutive days of stock prices.
	 * e.g., given [9, 11, 8, 5, 7, 10], this method returns 5
	 * buying on day 4 (5), selling on day 6 (10), total profit 5
	 * @param ar an array of integers representing consecutive stock prices
	 * @return the total possible profit
	 */
	@Deprecated
	public int tradeStockOld(int[] ar){
		if(ar == null || ar.length == 0) return 0;
		int max = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(max < ar[j]-ar[i]) max = ar[j]-ar[i];
			}
		}
		return max;
	}

	/**
	 * Finds the maximum singular transaction made from a list of integers
	 * representing consecutive days of stock prices.
	 * e.g., given [9, 11, 8, 5, 7, 10], this method returns 5
	 * buying on day 4 (5), selling on day 6 (10), total profit 5
	 * @param ar an array of integers representing consecutive stock prices
	 * @return the total possible profit
	 */
	public int tradeStock(int[] ar){
		if(ar == null || ar.length < 2) return 0;
		int max = 0, ret = 0, i = ar.length-1;
		do {
			if(max < ar[i]) {
				max = ar[i];
				continue;
			}
			if(ret < max - ar[i]) ret = max - ar[i];
		}while(--i >= 0);
		return ret;
	}

	/**
	 * Finds the maximum profit made from a list of integers
	 * representing consecutive days of stock prices.
	 * e.g., given [9, 11, 8, 5, 7, 10], this method returns 7
	 * buying on day 1 (9), selling on day 2 (11), profit 2
	 * buying again on day 4 (5), selling on day 6 (10), profit 5,
	 * total profit 7
	 * @param ar an array of integers representing consecutive stock prices
	 * @return the total possible profit
	 */
	public int tradeStocks(int[] ar){
		if(ar == null || ar.length == 0) return 0;
		int max = 0;
		for (int i = 0; i < ar.length - 1; i++) {
			if(ar[i+1]>ar[i]) max += ar[i+1]-ar[i];
		}
		return max;
	}
}
