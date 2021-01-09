package com.revature.questions;

import com.revature.util.RPSLS;

import java.util.ArrayList;
import java.util.List;

class ListNode{
	private RPSLS Val;
	private ArrayList<ListNode> WeakTo;

	public ListNode(RPSLS val) {
		this.Val = val;
		WeakTo = new ArrayList<>();
	}

	public RPSLS val() {
		return Val;
	}

	public ArrayList<ListNode> weakTo() {
		return WeakTo;
	}

	public void weakTo(ListNode weakTo) {
		this.WeakTo.add(weakTo);
	}
}

public class Q56RockPaperScissorsLizardSpock {
	List<ListNode> possibilities;

	public Q56RockPaperScissorsLizardSpock(){
		ListNode r  = new ListNode(RPSLS.ROCK);
		ListNode p  = new ListNode(RPSLS.PAPER);
		ListNode sc = new ListNode(RPSLS.SCISSORS);
		ListNode l  = new ListNode(RPSLS.LIZARD);
		ListNode sp = new ListNode(RPSLS.SPOCK);

		r.weakTo(sp);
		r.weakTo(p);
		p.weakTo(sc);
		p.weakTo(l);
		sc.weakTo(r);
		sc.weakTo(sp);
		l.weakTo(r);
		l.weakTo(sc);
		sp.weakTo(p);
		sp.weakTo(l);

		possibilities = new ArrayList<>();
		possibilities.add(r);
		possibilities.add(p);
		possibilities.add(sc);
		possibilities.add(l);
		possibilities.add(sp);
	}

	public String play(RPSLS p1, RPSLS p2){
		if(p1 == p2) return "TIE";
		for (int i = 0; i < possibilities.size(); i++) {
			ListNode curr = possibilities.get(i);
			if(curr.val() == p1){
				if(weaknessSearch(curr.weakTo(), p2)) return "Player 2 wins";
			} else if(curr.val() == p2) {
				if(weaknessSearch(curr.weakTo(), p1)) return "Player 1 wins";
			}
		}
		return "Not sure how you got here. Your universe is a 3rd grade science fair project, and I am failing.";
	}

	private boolean weaknessSearch(List<ListNode> nodes, RPSLS comparison){
		for (int i = 0; i < nodes.size(); i++) {
			ListNode weakness = nodes.get(i);
			if (weakness.val() == comparison) return true;
		}
		return false;
	}
}
