package com.revature.questions;

public class Q58Hanoi {
	private void move(char from, char to){
		System.out.println(String.format("Move disc from %c to %c!", from, to));
	}

	public void hanoiRecursion(int n, char from, char helper, char to){
		if(n == 0) return;
		else {
			hanoiRecursion(n-1, from, to, helper);
			move(from, to);
			hanoiRecursion(n-1, helper, from, to);
		}
	}
}
