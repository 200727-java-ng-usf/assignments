package com.revature.util;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	/*
		Employees are compared by department, name, then age.
	 */
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.equals(e2)) return 0;
		int result = e1.department.compareTo(e2.department);
		if(result == 0){
			result = e1.fname.compareTo(e2.fname);
			if(result == 0){
				result = e1.lname.compareTo(e2.lname);
				if(result == 0){
					return e1.age - (e2.age);
				} else return result;
			}else return result;
		} else return result;
	}
}
