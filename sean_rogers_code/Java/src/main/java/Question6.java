public class Question6 {
    public boolean isEven(int x) {
        if(x == 2 * (x / 2)) {
            System.out.println(x + " is even");
            return true;
        }
        System.out.println(x + " is NOT even");
        return false;
    }
}
