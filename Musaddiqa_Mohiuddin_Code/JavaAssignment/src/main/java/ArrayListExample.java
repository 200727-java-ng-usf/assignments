import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	private int evenSumAmount;
	private int oddSumAmount;
	
	
	public int getEvenSumAmount() {
		return evenSumAmount;
	}


	public int getOddSumAmount() {
		return oddSumAmount;
	}


	public void main(List<Integer> numberList) {

        List<Integer> nonPrimeList = new ArrayList<Integer>();
        

        System.out.println("Display all values");
        int evenAmount = 0;
        int oddAmount = 0;
        for (Integer number : numberList) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                evenAmount += number;
            } else {
                oddAmount += number;
            }

            int counter = 0;
            for (int num = number; num >= 1; num--) {
                if (number % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter != 2) {
                //Appended the Prime number to the String
                nonPrimeList.add(number);
            }
        }

        System.out.println("Sum of Even Numbers :" + evenAmount);
        System.out.println("Sum of Odd Numbers :" + oddAmount);
        this.evenSumAmount = evenAmount;
        this.oddSumAmount = oddAmount;
        System.out.println("Display Non prime Numbers");

        for (Integer number : nonPrimeList) {
            System.out.print(number + " ");
        }


    }

}