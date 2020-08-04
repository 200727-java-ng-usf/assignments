/**
 * find out if x is even. don't use modulo!
 */
public class Question6 {
    public boolean isEven(int x) {
        if(x == 2 * (x / 2)) { //if x is even, return true (without modulo)
            System.out.println(x + " is even");
            return true;
        }
        System.out.println(x + " is NOT even");
        return false;
    }
}
