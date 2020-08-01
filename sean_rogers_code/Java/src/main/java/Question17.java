import java.util.Scanner;

public class Question17 {
    public double calculateInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter principle");
        double principle = scanner.nextDouble();
        System.out.println("enter rate");
        double rate = scanner.nextDouble();
        System.out.println("enter time in years");
        int timeInYears = scanner.nextInt();

        return principle * rate * timeInYears;
    }
}
