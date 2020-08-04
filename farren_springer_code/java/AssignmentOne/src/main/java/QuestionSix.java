import java.util.Scanner;

public class QuestionSix {

    static boolean isEven(int n) {
        boolean isEven = true;

        for (int i = 1; i <= n; i++) {
            isEven = !isEven;
        }

        return isEven;
    }

    public static void main(String[] args) {

        System.out.println("Enter your integer: ");
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();

        System.out.println("The number is " + yourNumber);
        if(isEven(yourNumber)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

    }

} // done