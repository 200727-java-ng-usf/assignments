package com.revature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class EmployeeSorterQ7 implements Comparator {

    private ArrayList<Employee> employeeRoster = new ArrayList<Employee>(10);
    private int numEmployees = 0;

    public EmployeeSorterQ7() {
    }

    public EmployeeSorterQ7(ArrayList<Employee> employeeRoster, int numEmployees) {
        this.employeeRoster = employeeRoster;
        this.numEmployees = numEmployees;
    }

    public ArrayList<Employee> getEmployeeRoster() {
        return employeeRoster;
    }

    public void setEmployeeRoster(ArrayList<Employee> employeeRoster) {
        this.employeeRoster = employeeRoster;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public String toString() {
        return "EmployeeSorter{" +
                "employeeRoster=" + employeeRoster +
                ", numEmployees=" + numEmployees +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSorterQ7 that = (EmployeeSorterQ7) o;
        return numEmployees == that.numEmployees &&
                Objects.equals(employeeRoster, that.employeeRoster);
    }

    @Override
    public Comparator reversed() {
        return null;
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return null;
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeRoster, numEmployees);
    }

    public void addEmployee(String name, String department, int age) {
        employeeRoster.ensureCapacity(++numEmployees);
        employeeRoster.add(numEmployees, new Employee(name, department, age));
    }

    public void sort() {
    }

    private class Employee {

        private String name;
        private String department;
        private int age;

        public Employee(String name, String department, int age) {
            this.name = name;
            this.department = department;
            this.age = age;
        }

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
    }
}
