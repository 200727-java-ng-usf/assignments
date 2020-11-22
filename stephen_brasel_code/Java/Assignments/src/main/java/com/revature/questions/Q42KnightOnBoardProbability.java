package com.revature.questions;

import java.util.HashMap;
import java.util.Map;

public class Q42KnightOnBoardProbability {
	public double knightOnBoardProbability(int n, int m, int steps, int x, int y) {
		return successCount(new HashMap<String, Double>(), n, m, steps, x, y) // all successful moves
				/ Math.pow(8, steps); // all possible moves
	}
	private double successCount(Map<String, Double> entries, int n, int m, int steps, int x, int y){
		if(x < 0 || x >= n || y < 0 || y >= m) return 0.0d;
		else if(steps == 0) return 1.0d;
		String entry = ""+ steps +""+ x +""+ y;
		if(entries.get(entry) != null) return entries.get(entry);
		double success = 0.0d;
//		int[][] moves = {{1, 2},{1, -2},{-1, 2},{-1, -2},{2, 1},{2, -1},{-2, 1},{-2, -1}};
//		for(int[] move : moves){
//			success += successCount(entries, n, m, steps - 1, x+move[0], y+move[1]);
//		}
		for(int i = -2; i < 3; i += i == -1 ? 2 : 1){ // -2, -1, 1, -2
			for (int j = -1; j <= 1; j+=2) { // -1, 1
				int iy = (i & 1) == 0 ? j : 2*j; // if i is even, iy is odd.
				success += successCount(entries, n, m, steps - 1, x+i, y+iy);
			}
		}
		entries.put(entry, success);
		return success;
	}
}
