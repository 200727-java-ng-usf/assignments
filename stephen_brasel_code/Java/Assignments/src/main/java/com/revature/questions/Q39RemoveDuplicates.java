package com.revature.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q39RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		else if(nums.length == 1) return 1;
		int i = 0;
		int max = nums[nums.length - 1];
		for (int j = 1; j < nums.length; j++) {
			int numJ = nums[j];
			if (nums[i] != numJ) {
				nums[++i] = numJ;
				// the following only helps if there are more multiples of
				// the last number than the number of unique elements,
				// i.e.: {1, 2, 2, 3, 5, 5, 5, 5, 5}.
				// where uniqueCount == 4 && lastElementCount > uniqueCount
				if(numJ == max) break;
			}
		}
		return i + 1;
//		ArrayList<Integer> temp = new ArrayList<>();
//		temp.add(nums[0]);
//		for (int i = 1; i < nums.length; i++) {
//			if(temp.get(temp.size() - 1) != nums[i]){
//				temp.add(nums[i]);
//			}
//		}
//		nums = new int[temp.size()];
//		for (int i = 0; i < temp.size(); i++) {
//			nums[i] = temp.get(i);
//		}
//		return nums.length;
	}
//	double knightOnBoardProbability(int n, int m, int steps, int x, int y) {
//		if(steps == 0 && x >= 0 && x < n && y >= 0 && y < m) return 1.0d;
//		if(x < 0 || x >= n || y < 0 || y >= m) return 0.0d;
//		double prob = 1.0d, success = 0.0d, fail = 0.0d;
//		for (int i = 0; i < 8; i++) {
//			int increment = ((1/2)-2);
//			System.out.println(i + " " + increment);
//			double res = knightOnBoardProbability(n, m, steps - 1, x+increment, y+(3-increment));
//			if(res == 1.0d) success++;
//			else if(res > 0.0d) prob *= res;
//			else fail++;
//		}
//
//		return success+fail == 0.0d ? 0.0d : prob*(success/(success+fail));
//		// if(steps == 0 && x >= 0 && x < n && y >= 0 && y < m) return 1.0d;
//		// if(x < 0 || x >= n || y < 0 || y >= m) return 0.0d;
//		// double prob = 1.0d, success = 0.0d, fail = 0.0d;
//		// double res = knightOnBoardProbability(n, m, steps - 1, x-1, y-2);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//		// res = knightOnBoardProbability(n, m, steps - 1, x-1, y+2);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//		// res = knightOnBoardProbability(n, m, steps - 1, x-2, y-1);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//		// res = knightOnBoardProbability(n, m, steps - 1, x-2, y+1);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//		// res = knightOnBoardProbability(n, m, steps - 1, x+1, y-2);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//		// res = knightOnBoardProbability(n, m, steps - 1, x+1, y+2);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//		// res = knightOnBoardProbability(n, m, steps - 1, x+2, y-1);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//		// res = knightOnBoardProbability(n, m, steps - 1, x+2, y+1);
//		// if(res == 1.0d) success++;
//		// else if(res > 0.0d) prob *= res;
//		// else fail++;
//
//		// return success+fail == 0.0d ? 0.0d : prob*(success/(success+fail));
//		// if(steps == 0 && x >= 0 && x < n && y >= 0 && y < m) return 1.0d;
//		// if(x < 0 || x >= n || y < 0 || y >= m) return 0.0d;
//		// double prob = 0.0d, success = 0.0d, fail = 0.0d;
//		// if(knightOnBoardProbability(n, m, steps - 1, x-1, y-2) == 1.0d) success++;
//		// else fail++;
//		// if(knightOnBoardProbability(n, m, steps - 1, x-1, y+2) == 1.0d) success++;
//		// else fail++;
//		// if(knightOnBoardProbability(n, m, steps - 1, x-2, y-1) == 1.0d) success++;
//		// else fail++;
//		// if(knightOnBoardProbability(n, m, steps - 1, x-2, y+1) == 1.0d) success++;
//		// else fail++;
//		// if(knightOnBoardProbability(n, m, steps - 1, x+1, y-2) == 1.0d) success++;
//		// else fail++;
//		// if(knightOnBoardProbability(n, m, steps - 1, x+1, y+2) == 1.0d) success++;
//		// else fail++;
//		// if(knightOnBoardProbability(n, m, steps - 1, x+2, y-1) == 1.0d) success++;
//		// else fail++;
//		// if(knightOnBoardProbability(n, m, steps - 1, x+2, y+1) == 1.0d) success++;
//		// else fail++;
//
//		// return success+fail == 0.0d ? 0.0d : success/(success+fail);
//	}
}
