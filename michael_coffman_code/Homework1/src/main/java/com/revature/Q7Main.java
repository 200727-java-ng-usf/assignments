package com.revature;

import java.util.*;

import java.util.Comparator;
import java.util.Scanner;

public class Q7Main {

    String firstName;
    String lastName;
    String dept;
    int age;

    //-------------------------------------------------------------
    // employee constructor
    public Q7Main(String firstName, String lastName, String dept, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.age = age;
    }

    // getters and setters for employee
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // end of getters and setters
    //--------------------------------------------------------------
    // methods

    public static Comparator<Q7Main> compareFirstName = new Comparator<Q7Main>() {

        public int compare(Q7Main e1, Q7Main e2) {
            String fName1 = e1.getFirstName().toUpperCase();
            String fName2 = e2.getFirstName().toUpperCase();

            return fName1.compareTo(fName2);

        }
    };

    public static Comparator<Q7Main> compareLastName = new Comparator<Q7Main>() {

        public int compare(Q7Main e1, Q7Main e2) {
            String lName1 = e1.getLastName().toUpperCase();
            String lName2 = e2.getLastName().toUpperCase();

            return lName1.compareTo(lName2);

        }
    };

    public static Comparator<Q7Main> compareDepartment = new Comparator<Q7Main>() {

        public int compare(Q7Main e1, Q7Main e2) {
            String dept1 = e1.getDept().toUpperCase();
            String dept2 = e2.getDept().toUpperCase();

            return dept1.compareTo(dept2);

        }
    };

    public static Comparator<Q7Main> compareAge = new Comparator<Q7Main>() {

        public int compare(Q7Main e1, Q7Main e2) {
            int age1 = e1.getAge();
            int age2 = e2.getAge();

            return age1 - age2;

        }
    };

    @Override
    public String toString() {
        return  firstName +
                " " + lastName  +
                ", " + dept +
                ", " + age;
    }

    public static void main(String[] args) {

        String firstInput;
        String lastInput;
        String deptInput;
        int ageInput;

        // Enter employee information when adding to the array.
        //-----------------------------------------------------------
        ArrayList<Q7Main> employee = new ArrayList<Q7Main>();
        employee.add(new Q7Main("Michael", "Coffman", "Training", 29));
        employee.add(new Q7Main("John", "Smith", "Sales", 32));
        employee.add(new Q7Main("Abby", "Luck", "Engineering", 23));
        //------------------------------------------------------------

        System.out.println("Unsorted List: \n");
        for (Q7Main emp : employee) {
            System.out.println(emp);
        }
        System.out.println("+-------------------------------------+");

        System.out.println("After sorting by first name.\n");
        Collections.sort(employee, Q7Main.compareFirstName);
        for (Q7Main emp : employee) {
            System.out.println(emp);
        }
        System.out.println("+-------------------------------------+");

        System.out.println("After sorting by last name.\n");
        Collections.sort(employee, Q7Main.compareLastName);
        for (Q7Main emp : employee) {
            System.out.println(emp);
        }
        System.out.println("+-------------------------------------+");

        System.out.println("After sorting by department.\n");
        Collections.sort(employee, Q7Main.compareDepartment);
        for (Q7Main emp : employee) {
            System.out.println(emp);
        }
        System.out.println("+-------------------------------------+");

        System.out.println("After sorting by age.");
        Collections.sort(employee, Q7Main.compareAge);
        for (Q7Main emp : employee) {
            System.out.println(emp);
        }
    }
}