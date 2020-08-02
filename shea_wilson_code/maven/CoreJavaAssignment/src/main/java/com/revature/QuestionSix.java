package com.revature;

public class QuestionSix{

	static String evenNumber(int x){
	
	int a, b, c; 

	a = x / 2; // divide your initial number by 2
	b = a * 2; // multiply that truncated amount by 2
	c = x - b; // find the difference between the initial number that new product
		
	if ( c == 0 ){
		 System.out.println("Even Number"); //if the difference is zero then the number is even
	}
	else 
		System.out.println("Odd Number"); // if the difference is not zero then the number is odd.
	return "";
	}

	
	public static void main(String[] args){
		
	evenNumber(23);
	
	}
}