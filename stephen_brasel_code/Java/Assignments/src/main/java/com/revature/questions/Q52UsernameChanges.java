package com.revature.questions;

import java.util.ArrayList;
import java.util.List;

public class Q52UsernameChanges {
	/*
	 * Complete the 'possibleChanges' function below.
	 *
	 * The function is expected to return a STRING_ARRAY.
	 * The function accepts STRING_ARRAY usernames as parameter.
	 */

	public static List<String> possibleChanges(List<String> usernames) {
		// Write your code here
		List<String> results = new ArrayList<>();
		boolean isSwappable;
		int i, j;
		for(i = 0; i < usernames.size(); i++){
			String s = usernames.get(i);
			char c = s.charAt(0);
			isSwappable = false;
			for(j = 1; j < s.length(); j++){
				if(c > s.charAt(j)){
					isSwappable = true;
					break;
				}
			}
			results.add(isSwappable ? "YES" : "NO");
		}
		return results;

	}
}
