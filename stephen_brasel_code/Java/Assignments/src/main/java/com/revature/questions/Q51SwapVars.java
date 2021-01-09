package com.revature.questions;

public class Q51SwapVars {
	// int x = 11, y = 5;

	/**
	 *
	 * @param x
	 * @param y
	 */
	public void swapTemp(int[] x, int[] y){
		if(x == y || x == null || y == null || x.length != y.length) return;
		for (int i = 0; i < x.length; i++) {
			if(x[i] != y[i]) {
				int temp = x[i];
				x[i] = y[i];
				y[i] = temp;
			}
		}
	}

	/**
	 *
	 * @param x
	 * @param y
	 * @throws ArithmeticException
	 */
	public void swapZero(int[] x, int[] y) {
		if(x == y || x == null || y == null || x.length != y.length) return;
		for (int i = 0; i < x.length; i++) {
			if(x[i] != y[i]) {
				x[i] = y[i] + 0 * (y[i] = x[i]);
			}
		}
	}

	/**
	 *
	 * @param x
	 * @param y
	 * @throws ArithmeticException
	 */
	public void swapAdditive(int[] x, int[] y) {
		if(x == y || x == null || y == null || x.length != y.length) return;
		for (int i = 0; i < x.length; i++) {
			if(x[i] != y[i]) {
				x[i] = x[i] + y[i] - (y[i] = x[i]);
//				x[i] += y[i]; // x = 16
//				y[i] = x[i] - y[i]; // y = 11
//				x[i] -= y[i]; // x = 5
			}
		}
	}

	/**
	 *
	 * @param x
	 * @param y
	 * @throws ArithmeticException
	 */
	public void swapMultiplicative(int[] x, int[] y) {
		if(x == y || x == null || y == null || x.length != y.length) return;
		for (int i = 0; i < x.length; i++) {
			if(x[i] != y[i]) {
				if(x[i] == 0) {
					x[i] = y[i];
					y[i] = 0;
				}
				else if(y[i] == 0){
					y[i] = x[i];
					x[i] = 0;
				}
				else {
					x[i] = x[i] * y[i]; // x = 55
					y[i] = x[i] / y[i]; // y = 11
					x[i] = x[i] / y[i]; // x = 5
				}
			}
		}
	}
	// x = 1011, y = 0101

	/**
	 *
	 * @param x
	 * @param y
	 */
	public void swapXOR(int[] x, int[] y){
		if(x == y || x == null || y == null || x.length != y.length) return;
		for (int i = 0; i < x.length; i++) {
			if(x[i] != y[i]) {
				x[i] = x[i] ^ y[i] ^ (y[i] = x[i]);
//				x[i] = (y[i] ^= x[i] ^= y[i]) ^ x[i];
			}
		}
	}

	/**
	 *
	 * @param x
	 * @param y
	 */
	public void swapString(String[] x, String[] y){
		if(x == y || x == null || y == null || x.length != y.length) return;
		for (int i = 0; i <x.length; i++) {
			if(!x[i].equals(y[i])) {
				x[i] += y[i];
				y[i] = x[i].substring(0, x[i].length() - y[i].length());
				x[i] = x[i].substring(y[i].length());
			}
		}
	}
}
