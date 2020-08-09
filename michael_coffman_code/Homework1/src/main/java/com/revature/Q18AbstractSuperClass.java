package com.revature;

public abstract class Q18AbstractSuperClass {

    private boolean upperCase;
    private String lowerToUpper;
    private int stringToIntegerPlus10;

    public Q18AbstractSuperClass(boolean upperCase, String lowerToUpper, int stringToIntegerPlus10) {
        System.out.println("This is a new superClass constructor");
        this.upperCase = upperCase;
        this.lowerToUpper = lowerToUpper;
        this. stringToIntegerPlus10 = stringToIntegerPlus10;
    }

    // for testing purposes
    public Q18AbstractSuperClass() {
        super();
    }

    // abstract method 1
    public abstract boolean upperCaseMethod(boolean upperCase);

    // abstract method 2
    public abstract String lowerToUpperMethod(String lowerToUpper);

    // abstract method 3
    public abstract int stringToIntegerPlus10Method(int stringToIntegerPlus10);

}
