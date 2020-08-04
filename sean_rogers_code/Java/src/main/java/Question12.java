/**
 * stores numbers from 1 to 100 in an array. Prints out all the even
 * numbers from the array. Uses the enhanced FOR loop for printing out the numbers
 */
public class Question12 {
    public int[] displayEvenNumbers() {
        int[] numbers = new int[100];
        int[] evenNumbers = new int[numbers.length / 2];
        int evenNumbersIndex = 0;
        for(int i = 1; i < 100; i++) {
            numbers[i] = i;
        }

        for(int number : numbers) {
            if(number % 2 == 0) {
                System.out.println(number);
                evenNumbers[evenNumbersIndex] = number;
                evenNumbersIndex++;
            }
        }

        return evenNumbers;
    }
}
