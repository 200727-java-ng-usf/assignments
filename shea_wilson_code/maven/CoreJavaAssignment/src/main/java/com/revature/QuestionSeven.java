package com.revature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;



public class QuestionSeven {

	public static void main(String[] args){

	Employee emp1 = new Employee("Sean","Admin",20);
	Employee emp2 = new Employee("Jasmin","Production",25);

	List<Employee> emp = new ArrayList<Employee>();

	emp.add(emp1);
	emp.add(emp2);

	Comparator<Employee> com = new CompSim() {

		public int compare(Employee a1, Employee a2) {
			return a1.getAge() - a2.getAge();
		}

		public boolean equals(Object obj) {
			return false;
		}
	};

	Collections.sort(emp,com);

			System.out.println(emp);
	}

}
 	class Employee{
	 String name;
	 String dep;
	 int age;

	   Employee(String name, String dep, int age){
	   this.name = name;
	   this.dep = dep;
	   this.age = age;
	   }
	   
	   @Override
	   public String toString(){
	       return name + " "+ dep + " " + age ;
	   }
	   
	   public String getName(){
	       return name;
	   }
	   
	   public String getDep(){
	       return dep;
	   }
	   
	   public int getAge(){
	       return age;
	   }
	}

//-------------------------------------------------------

// for the comparator interface



//public class CompSim implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee a1, Employee a2){
//
//		return a1.getAge() - a2.getAge();
//
//	}
//}