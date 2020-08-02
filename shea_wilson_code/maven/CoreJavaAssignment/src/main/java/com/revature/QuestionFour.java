package com.revature;

class QuestionFour {
	public static int fact(int n){

	  if (n==0)
		return 1;
	  else
		return (n * fact(n-1));
	
	}
	public static void main (String[] args){
		
		int num = 9;
		System.out.println(fact(num));
	}

}