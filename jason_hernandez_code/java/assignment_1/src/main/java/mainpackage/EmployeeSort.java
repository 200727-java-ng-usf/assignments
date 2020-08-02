package mainpackage;

import java.util.Comparator;

public class EmployeeSort implements Comparator {

    // First create the params
    private String name;
    private String department;
    private int age;
    void Employee(){

    }

    // Plug the params into the variable
    void Employee(String n, String d, int a) {
        name = n;
        department = d;
        age = a;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // The sort is done here
    public void compare(Employee n1, Employee n2) {

    }
    public void compare(Employee d1, Employee d2) {

    }
    public void compare(Employee a1, Employee a2) {

    }

}
