import java.util.ArrayList;

public class Question19 {
    ArrayList<Integer> alNumbers = new ArrayList<Integer>();
    public Question19() {
        for(int i = 1; i <= 10; i++) {
            alNumbers.add(i);
        }
        System.out.println(alNumbers.toString());
    }
    public int addEvens() {
        int total = 0;
        for(int i = 0; i < alNumbers.size(); i++) {
            if(alNumbers.get(i) % 2 == 0) {
                total += alNumbers.get(i);
            }
        }
        System.out.println(total);
        return total;
    }
    public int addOdds() {
        int total = 0;
        for(int i = 0; i < alNumbers.size(); i++) {
            if(alNumbers.get(i) % 2 == 1) {
                total += alNumbers.get(i);
            }
        }
        System.out.println(total);
        return total;
    }
    public String removePrimesAndDisplay() {
        boolean isPrime;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        //get prime numbers and add them to primeNumbers
        for(int i = 1; i < alNumbers.get(alNumbers.size() - 1); i++) {
            isPrime = true;
            for(int j = i - 1; j > 1; j--) {
                if(i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime){
                primeNumbers.add(i);
            }

        }

        //remove prime numbers from alNumbers
        for(int i = 0; i < primeNumbers.size(); i++) {
            if(alNumbers.contains(primeNumbers.get(i))) {
                alNumbers.remove(primeNumbers.get(i));
            }
        }
        System.out.println(alNumbers.toString());
        return alNumbers.toString();
    }
}
