package com.revature.coreJavaAssign;

import java.util.Comparator;

public  class q7SortEmployees implements Comparator<q7SortEmployees> {
    //Here is a POJO
    private String name;
    private String department;
    private int age;

    public q7SortEmployees() {
    }

    public q7SortEmployees(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    //Overridden toString method
    @Override
    public String toString() {
        return "q7SortEmployees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    // Getter and Setters
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


        @Override
        //after talking to my collegues i realized that i shouldnt have 3 classes with 3 different override methods
        public int compare(q7SortEmployees emp1, q7SortEmployees emp2) {
            if (emp1.getName().compareTo(emp2.getName()) > 0) {
                return 1;
            } else if (emp1.getName().compareTo(emp2.getName()) < 0) {
                return -1;
            }
            if (emp1.getDepartment().compareTo(emp2.getDepartment()) >0){
                return 1;
            } else if(emp1.getDepartment().compareTo(emp2.getDepartment())<0){
                return -1;
            }
            if (emp1.getAge() > emp2.getAge()){
                return 1;
            }else if (emp1.getAge() < emp2.getAge()){
                return -1;
            }
                return 0;
            }

//            @Override
//            public int compare(q7SortEmployees emp1, q7SortEmployees emp2) {
//
//                if (emp1.getDepartment().compareTo(emp2.getDepartment()) > 0) {
//                    return 1;
//                } else if (emp1.getDepartment().compareTo(emp2.getDepartment()) < 0) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//
//            }
//
//
//
//            @Override
//            public int compare(q7SortEmployees emp1, q7SortEmployees emp2) {
//
//                if (emp1.getAge() > emp2.getAge()) {
//                    return 1;
//                } else if (emp1.getAge() < emp2.getAge()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }

    }






