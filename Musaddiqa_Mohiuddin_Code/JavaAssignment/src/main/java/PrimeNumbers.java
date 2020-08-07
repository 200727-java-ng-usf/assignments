import java.util.List;

public class PrimeNumbers {
    private String  primeValues;
    
    
	
	public String getPrimeValues() {
		return primeValues;
	}



	public void main (List<Integer> numberList) {
        int num =0;
        //Empty String
        String primeNumbers = "";
        for(Integer number : numberList) {
            int counter=0;
            for(num =number; num>=1; num--) {
                if(number%num==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + number + " ";
            }
        }

        System.out.println("Prime numbers from 1 to 100 are :");
        System.out.println(primeNumbers);
        this.primeValues = primeNumbers;
    }
}
