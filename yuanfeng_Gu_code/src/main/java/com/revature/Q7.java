package com.revature;

public class Q7 implements Comparable<Q7> {

    private String name;
    private String department;
    private int age;

    public Q7(String name, String department, int age) {
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

    @Override
    public int compareTo(Q7 employee) {
        int num = this.age - employee.age; //compare age
        int num2=1,num3=1;
        if(num==0){
            num2 = this.department.compareTo(employee.department); //compare department

            return num2;
        }else if(num2 ==0){
            num3 = this.name.compareTo(employee.name); //compare name

            return  num3;

        }else{
            return num;
        }
    }
}

