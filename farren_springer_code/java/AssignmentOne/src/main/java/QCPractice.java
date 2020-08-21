

public class QCPractice {

    public static boolean isEven(int n) {
        if(n/2*2 == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(7));
    }
}
