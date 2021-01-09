package com.revature.questions;

import com.revature.util.operators.BooleanOperator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q54Anagram implements BooleanOperator {
	public boolean caseSensitive = false;

	@Override
	public boolean execute(Object... o) {
		String s1, s2;
		if(o.length > 1) {
			s1 = (String)o[0];
			s2 = (String)o[1];
		} else return false;
//		if(s1 == null && s2 == null) return true;
//		if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
//		if(!caseSensitive){
//			s1 = s1.toLowerCase();
//			s2 = s2.toLowerCase();
//		}
//		for (int i = 0; i < s1.length(); i++) {
//			int j = 0;
//			for (; j < s2.length(); j++) {
//				if(s1.charAt(i) == s2.charAt(j)){
//					s2 = s2.substring(0, j) + s2.substring(j+1);
//					break;
//				}
//			}
//			if(j == s2.length() && j != 0) return false;
//		}
//		return s2.length() == 0;
		String switcher = o.length > 2 ? (String)o[2] : "no argument given, using Sort method.";
		System.out.println(switcher);
		switch (switcher){
			default:
			case "Sort":
				return areAnagramsSort(s1, s2);
			case "CaseSensitive":
				return areAnagramsSort(s1, s2, o.length > 3 ? (Boolean)o[3] : caseSensitive);
			case "Erode":
				return areAnagramsErode(s1, s2, false);
			case "ErodeLL":
				return areAnagramsErodeLL(s1, s2, false);
		}
	}

	public boolean areAnagramsSort(String s1, String s2){
		return areAnagramsSort(s1, s2, false);
	}

	public boolean areAnagramsSort(String s1, String s2, boolean caseSensitive){
		if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
		char[] c1 = caseSensitive ? s1.toCharArray() : s1.toLowerCase().toCharArray();
		char[] c2 = caseSensitive ? s2.toCharArray() : s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}

	public boolean areAnagramsErode(String s1, String s2, boolean caseSensitive){
		if(s1 == null && s2 == null) return true;
		if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
		if(!caseSensitive){
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
		}
		for (int i = 0; i < s1.length(); i++) {
			int j = 0;
			for (; j < s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j)){
					s2 = s2.substring(0, j) + s2.substring(j+1, s2.length());
					break;
				}
			}
			if(j == s2.length() && j != 0) return false;
		}
		return s2.length() == 0;
	}

	public boolean areAnagramsErodeLL(String s1, String s2, boolean caseSensitive){
		if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
		if(!caseSensitive){
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
		}
		List<Character> l1 = new LinkedList<>();
		List<Character> l2 = new LinkedList<>();
		for (int i = 0; i < s1.length(); i++) {
			l1.add(s1.charAt(i));
			l2.add(s2.charAt(i));
		}
		for (int i = 0; i < l1.size(); i++) {
			int j = 0;
			for (; j < l2.size(); j++) {
				if(l1.get(i) == l2.get(j)){
					l2.remove(j);// = l2.substring(0, j) + l2.substring(j+1, l2.length());
					break;
				}
			}
			if(j == l2.size() && j != 0) return false;
		}
		return l2.size() == 0;
	}

}
