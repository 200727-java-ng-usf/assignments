package com.revature;

public class Q18Main extends Q18AbstractSuperClass{


    private Q18Main(boolean upperCase, String lowerToUpper, int stringToIntegerPlus10) {
        super(upperCase, lowerToUpper, stringToIntegerPlus10);
    }

    // for testing purposes
    public Q18Main() {
        super();
    }

    @Override
    public boolean upperCaseMethod(boolean upperCase) {
        return false;
    }

    @Override
    public String lowerToUpperMethod(String lowerToUpper) {
        return null;
    }

    @Override
    public int stringToIntegerPlus10Method(int stringToIntegerPlus10) {
        return 0;
    }
}
