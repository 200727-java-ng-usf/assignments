package com.revature;

public class QuestionFive{

	static String subString(String str, int idx ){
	int x = idx;
	
	    for(int i = 0 ; i <= x ; i++){
		char newStr = str.charAt(i);
		System.out.print(newStr);
		
	    }
	    return "";	
	}

	public static void main(String[] args){

	System.out.println(subString("Get worked" , 3));

    }

}