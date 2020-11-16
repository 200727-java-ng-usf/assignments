package com.revature;

public class Driver {
	public static void main(String[] args) {
		recurse(0);
	}

	private static void recurse(int depth){
		if(depth < 4){
			for(int i = 0; i < depth; i++){
				System.out.print("    ");
			}
			System.out.println("starting at depth " + depth);
			for(int i = 0; i < 2; i++){
				recurse(depth + 1);
			}
			for(int i = 0; i < depth; i++){
				System.out.print("    ");
			}
			System.out.println("ending at depth " + depth);
		}
	}
}
