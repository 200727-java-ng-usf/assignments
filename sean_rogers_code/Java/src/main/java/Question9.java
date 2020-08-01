import java.util.ArrayList;

public class Question9 {

    public ArrayList<Integer> displayPrimeNumbers() {
        ArrayList<Integer> oneTo100 = new ArrayList<Integer>();
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        boolean isPrime;

        // declare each element in oneTo100
        for(int i = 1; i <= 100; i++) {
            oneTo100.add(i);
        }

        /*for(int i = oneTo100.get(oneTo100.size() - 1); i > 1; i--) {
            isPrime = true;
            for(int j = i - 1; j > 1; j--) {
                if(i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime)
                primeNumbers.add(i);
        }*/
        for(int i = 1; i < oneTo100.get(oneTo100.size() - 1); i++) {
            isPrime = true;
            for(int j = i - 1; j > 1; j--) {
                if(i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime)
                primeNumbers.add(i);
        }
            System.out.println(primeNumbers.toString());
        return primeNumbers;
    }
    
}
