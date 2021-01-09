package com.revature.questions;

public class Q60CompleteTheWord {
	public boolean canComplete(String s1, String fullWord){
		if(s1 == null || fullWord == null || s1.length() > fullWord.length()) return false;
		if(s1.isEmpty()) return true;
		for (int i = 0, j = 0; i < fullWord.length(); i++)
			if(s1.charAt(j) == fullWord.charAt(i) && ++j == s1.length()) return true;
		return false;
	}
}
