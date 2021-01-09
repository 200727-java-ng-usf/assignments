package com.revature.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q40RemoveWhiteSpace {
	public String deleteWhitespacesReplaceAll(String inputStr) {
		return inputStr == null ? "" : inputStr.replaceAll("\\s+", "");
	}
	public String deleteWhitespacesMatcher(String inputStr) {
		if(inputStr == null) return "";
		StringBuilder strb = new StringBuilder();
		Matcher matcher = Pattern.compile("(\\S)+").matcher(inputStr);
		while(matcher.find()){
			strb.append(matcher.group());
		}
		return strb.toString();
	}

	public String deleteWhitespaces(String inputStr) {
		if(inputStr == null) return "";
		StringBuilder strb = new StringBuilder();
		for (int i = 0; i < inputStr.length(); i++) {
			char c = inputStr.charAt(i);
			if(c != '\t' && c != ' ' && c != '\r' && c != '\n')
				strb.append(c);
		}
		return strb.toString();
	}
}
