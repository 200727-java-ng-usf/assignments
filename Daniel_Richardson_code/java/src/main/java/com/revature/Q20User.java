package com.revature;


public class Q20User{

    private String firstN;
    private String lastN;
    private int age;
    private String state;

    public Q20User(){
        super();
    }

    public Q20User(String firstN, String lastN, int age, String state) {
        this.firstN = firstN;
        this.lastN = lastN;
        this.age = age;
        this.state = state;
    }


    //convenience method
    //to convert object into file string
    public void printData(){
        System.out.println("Name: " + firstN + " " + lastN);
        System.out.println("Age: " + age);
        System.out.println("State: " + state);
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}