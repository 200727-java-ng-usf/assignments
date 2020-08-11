package mainpackage;

// This allows it to access the second package
import secondpackage.*;

public class PackageFloat {

    // This is a class in the second package
    public void storeFloat() {
        System.out.println("The value of pi is " + StoreFloat.a);
        System.out.println("The value of e is " + StoreFloat.b);
    }
}
