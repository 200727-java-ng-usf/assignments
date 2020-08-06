import java.util.Scanner;

public class QuestionSix {

    static boolean isEven(int n) {
        return ((n / 2) * 2 == n);
    }

    public static void main(String[] args) {

        System.out.print("Enter your integer: ");

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Assign user input to appropriate fields
        int yourNumber = scanner.nextInt();

        // Call the method
        System.out.println("The number is " + yourNumber);
        if(isEven(yourNumber)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

    }

} // done