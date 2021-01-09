package com.revature.questions;

public class Q61OrderedWord {
	public boolean inOrder(String str){
		if(str == null) return false;
		for (int i = 0; i < str.length() - 1; i++)
			if(str.charAt(i) > str.charAt(i+1)) return false;
		return true;
	}
}
