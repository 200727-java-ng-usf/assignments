public class Q6 {

    static boolean isEven(int n) {
        boolean isEven = true;

        for (int i = 1; i <= n; i++) {
            isEven = !isEven;
        }

        return isEven;
    }

    public static void main(String[] args) {
        int n = 101;
        System.out.println("The number is 101");
        if(isEven(n)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

}

}
