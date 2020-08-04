package assignment.questions;

import assignment.questions.question7.Employee;
import assignment.questions.question7.SortByAge;
import assignment.questions.question7.SortByDepartment;
import assignment.questions.question7.SortByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Q7  {

    public void sortEmployees(){
        //creating employee list
        Employee John = new Employee("John Doe", "Cashier", 20);
        Employee Jane = new Employee("Jane Doe", "Manager", 28);
        ArrayList<Employee> em = new ArrayList<Employee>();
        em.add(John);
        em.add(Jane);
        //using the collections class, created new classes
        // each class will access the employee objs and compare them to each other
        // it will return a number for collections.sort to sort the array
        Collections.sort(em, new SortByName());
        System.out.println("Sorted by Name: ");
        for (int i=0; i<em.size(); i ++){
            System.out.println(em.get(i));
        }
        Collections.sort(em, new SortByDepartment());
        System.out.println("Sorted by Department: ");
        for (int i=0; i<em.size(); i ++){
            System.out.println(em.get(i));
        }
        Collections.sort(em, new SortByAge());
        System.out.println("Sorted by Age: ");
        for (int i=0; i<em.size(); i ++){
            System.out.println(em.get(i));
        }

    }


}
