package com.revature;

import java.util.Arrays;
import java.util.Random;

public class Driver {
	static int count = 0;
	public static void main(String[] args) {
		int heads = 1, tails = 0;
		Random random = new Random();
		int[][] board = new int[8][8];
		for (int i = 0; i < board.length; i++) {
			board[i] = new int[8];
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ((random.nextInt() & 1) == 0) ? heads : tails;
			}
			System.out.println(Arrays.toString(board[i]));
		}
//		testLoopingConditionals();
//		recurse(0);
	}

	private static void testLoopingConditionals() {
		int i = 0;
		int k = 2;
		int[] ar = new int[10];
		int increment = ar.length + k - giveIncrement();
		for (System.out.println("hi!"); i+giveIncrement() < ar.length; i+=giveIncrement()) {

		}
		i = 0;
		while(i+giveIncrement() < ar.length){
			System.out.println(i+=giveIncrement());
		}
		i = 0;
		do{

		}while((i+=giveIncrement()) < ar.length);
	}

	public static int giveIncrement(){
		System.out.println("in giveIncrement: " + count++);
		return 1;
	}

	private static void recurse(int depth, int maxDepth){
		if(depth < maxDepth){
			for(int i = 0; i < depth; i++){
				System.out.print("    ");
			}
			System.out.println("starting at depth " + depth);
			for(int i = 0; i < 2; i++){
				recurse(depth + giveIncrement(), maxDepth);
			}
			for(int i = 0; i < depth; i++){
				System.out.print("    ");
			}
			System.out.println("ending at depth " + depth);
		}
	}
}
