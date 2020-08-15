package com.revature;

import java.util.ArrayList;

import static com.revature.AppDriver.defaults;

public class Q7 {
    //Q7. Sort two employees based on their name, department, and age using the Comparator interface.

    public Q7(){
        ArrayList<Q7Employee> employees = orgMaker();
        employeeSort(employees);
    }

    public ArrayList<Q7Employee> orgMaker(){
        ArrayList<Q7Employee> employees = new ArrayList<>();
        int employeeCount;
        if(!defaults){ //build-your-own organization
            System.out.println("Requires employee data.");
            System.out.println("Input number of employees.");
            InputHandler input = InputHandler.getInstance();
            employeeCount = input.intInput();
            String name, department;
            int age;
            for(int i = 1; i < employeeCount+1; i++){
                System.out.println("Enter name(string) for employee "+i+" .");
                name = input.strInput();
                System.out.println("Enter age(int) for employee "+i+" .");
                age = input.intInput();
                System.out.println("Enter department(string) for employee "+i+" .");
                department = input.strInput();
                employees.add(new Q7Employee(name, age, department));
            }
        } else { //premade data

            Q7Employee emp1 = new Q7Employee("Nick Ivanov", 24, "Engineering");
            Q7Employee emp2 = new Q7Employee("Stefan Anderson", 23, "Public Affairs");
            employees.add(emp1);
            employees.add(emp2);
        }
        return employees;
    }

    public void employeeSort(ArrayList<Q7Employee> employees) {
        employeeDisplay(employees); //send to displayer for pre-check
        employees.sort((ep1, ep2) -> {
            if (ep1.getAge() > ep2.getAge()) return 1;
            else if (ep1.getAge() < ep1.getAge()) return -1;
                //else return 0;
            else return ep1.getName().compareTo(ep2.getName()); //fallback to comparing name, returns 0 etc
        });
        employeeDisplay(employees); //checking results
    }

    public void employeeDisplay(ArrayList<Q7Employee> employees){ //could probably use another Q's displayer
        for(Q7Employee person : employees){
            System.out.println(person.toString());
        }
        System.out.println("-");
    }
}
