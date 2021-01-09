package com.revature.questions;

public class Q57StrsAndWeaks {

	public String play(int p1, int p2, int n) {
		if (p1 == p2) return "TIE";
		for (int i = 0; i < n / 2; i++)
			if ((p1 + 1 + 2 * i) % n == p2) return "Player 2 wins";
		return "Player 1 wins";
	}
}
