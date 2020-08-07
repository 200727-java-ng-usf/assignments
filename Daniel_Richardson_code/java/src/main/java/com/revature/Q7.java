package com.revature;

import java.util.ArrayList;

public class Q7 {
    //Q7. Sort two employees based on their name, department, and age using the Comparator interface.


    public static void employeeSort() {

        Q7Employee emp1 = new Q7Employee("Barnabas Jack", 23, "HR");
        Q7Employee emp2 = new Q7Employee("Anton Macky", 21, "Sales");
        ArrayList<Q7Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        for(Q7Employee person : employees){
            System.out.println(person.toString());
        }
        employees.sort((ep1, ep2) -> {
            if (ep1.getAge() > ep2.getAge()) return 1;
            else if (ep1.getAge() < ep1.getAge()) return -1;
                //else return 0;
            else return ep1.getName().compareTo(ep2.getName()); //fallback to comparing name, returns 0 etc
        });
        System.out.println("-");
        for(Q7Employee person : employees){
            System.out.println(person.toString());
        }
    }
}
