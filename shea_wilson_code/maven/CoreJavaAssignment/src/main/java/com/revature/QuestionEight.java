package com.revature;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ListIterator;

public class QuestionEight{

	static String palin(String w){

		String pa = w;

		for(int i = 0 ; i < pa.charAt(pa.length()-1); --i){
			System.out.println(pa.charAt(i));
		}

		return " ";
	}

	public static void main(String[] args){
		
		ListIterator<String> litr,litr2 ;
		ArrayList<String> first = new ArrayList<>();
		first.add("karan");
		first.add("madam");
		first.add("tom");
		first.add("civic");
		first.add("radar");
		first.add("jimmy");
		first.add("kayak");
		first.add("john");
		first.add("refer");
		first.add("billy");
		first.add("did");

		
		litr = first.listIterator();
		System.out.println("First List: ");
		while(litr.hasNext()){
		System.out.println(litr.next());
		}

		System.out.println("----------------------------------------");

		ArrayList<String> second = new ArrayList<>(first);//
		System.out.println("Second List: ");
		litr2 = second.listIterator();
		while(litr2.hasNext()){
			System.out.println(litr2.next());
		}


		

	}

}
