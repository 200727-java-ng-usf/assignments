package Q11AccessFloats;

import Q11FloatsPackage.Q11Floats;

public class Q11AccessFloats {

    public static void main(String[] args) {

        System.out.println("A float from another package: " + Q11Floats.getFloat1());
        System.out.println("Another float from the same package as the other float: " + Q11Floats.getFloat2());

    }

} // done
