package com.revature;
import java.util.ArrayList;
import java.util.ListIterator;

public class QuestionEight{

	//method that should retrieve the reverse of each word

	public static String palin(String w){

		String pa = w;

		// for loop to iterate through each char in each word from last to first
		// and print the result

		for(int i = pa.length()-1; i >=0  ; i --){
			System.out.print(pa.charAt(i));
		}

		return " ";
	}

	public static void main(String[] args){
		// instantiated two ListIterators to read each name in the collection of first and second.
		ListIterator<String> litr,litr2 ;
		// Instantiated the ArrayList of first.
		ArrayList<String> first = new ArrayList<>();

		// Added the names to the first collection
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
		while(litr.hasNext()){ //while there is something to read in the next spot keep going
		System.out.println(litr.next()); //print the name
		}

		System.out.println("----------------------------------------");

		ArrayList<String> second = new ArrayList<>(first);// copy the first collection to the second
		System.out.println("Second List: ");
		litr2 = second.listIterator();
		while(litr2.hasNext()){
			System.out.println(palin(litr2.next())); //print out the second list with the words in reverse.
		}
	}

}
