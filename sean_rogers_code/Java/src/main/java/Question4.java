public class Question4 {
    public int factorial(int x) {
        int total = 1;
        for(int i = x; i > 0; i--) {
            total *= i;
        }
        System.out.println(x + "! = " + total);
        return total;
    }
}
