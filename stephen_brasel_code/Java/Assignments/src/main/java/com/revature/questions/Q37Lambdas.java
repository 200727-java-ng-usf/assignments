package com.revature.questions;

import java.util.ArrayList;
import java.util.List;

public class Q37Lambdas {
	public int sum(List<Integer> ar){
		ar.forEach(n -> System.out.print(n + ", "));
		return ar.stream().reduce(0, (sum, next) -> sum + next);
	}

}
