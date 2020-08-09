import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionFourteen {

    // Method that uses switch case
    public static String switchCaseExample(int theCaseNumber) {

        // Create a new scanner to take in user input in the case of case 1
        Scanner scanner = new Scanner(System.in);

        switch (theCaseNumber) {
            case 1:
                System.out.println("Enter a number: ");
                int num = scanner.nextInt();
                double ans = Math.sqrt(num);
                System.out.println("Here is the square root of that number: " + ans);
                return Double.toString(ans);
                // no need for break; because return statement
            case 2:
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                System.out.println(dtf.format(now));
                return dtf.format(now);
            case 3:

                System.out.println("'I am learning Core Java' ...Separating this phrase by word: ");

                // instantiate the string to split
                String originalString = "I am learning Core Java.";
                String[] splitArray;

                // instantiate the delimitor
                String separator = " ";

                splitArray = originalString.split(separator);

                // print the strings in the splitArray
                System.out.println("Here is the new array of strings, separated by line: ");
                for (int i = 0; i < splitArray.length; i++) {
                    System.out.println(splitArray[i]);
                }
                return Arrays.toString(splitArray);
        }
        return "Didn't go through";
    }

    public static void main(String[] args) {

        // Explain what the method will do
        System.out.println("Case 1 will find the square root of a number.");
        System.out.println("Case 2 will print the date and time.");
        System.out.println("Case 3 will split the string: 'I am learning Core Java.'");
        System.out.println("Which case would you like to execute? Enter 1, 2, or 3: ");

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        int theCaseNumber = scanner.nextInt();

        switchCaseExample(theCaseNumber);

    } // end main

} // end class
// done


