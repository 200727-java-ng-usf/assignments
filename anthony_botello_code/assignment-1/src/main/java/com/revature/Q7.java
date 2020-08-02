package com.revature;

import java.util.Comparator;

public class Q7 {

    public static class Employee {

        private String name;
        private String department;
        private Integer age;

        public static Comparator<Employee> compareByName = Comparator.comparing(Employee::getName, (String a, String b) -> a.compareTo(b));
        public static Comparator<Employee> compareByDepartment = Comparator.comparing(Employee::getDepartment, (String a, String b) -> a.compareTo(b));
        public static Comparator<Employee> compareByAge = Comparator.comparing(Employee::getAge, (Integer a, Integer b) -> a.compareTo(b));
        
        public Employee(String name, String department, Integer age) {
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

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}