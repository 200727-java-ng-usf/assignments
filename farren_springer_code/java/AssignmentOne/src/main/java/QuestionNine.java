import java.util.Arrays;

public class QuestionNine {

    public static boolean isPrime(int n) {
        int flag = 0;
        int m=n/2;
        if(n==0||n==1){
            return false;
        }else{
            for(int j=2;j<=m;j++){
                if(n%j==0){
                    flag = 1;
                    return false;
                }
            }
            if(flag==0)  {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        int[] hundredArray = new int[100];

        for(int i = 1; i < 101; i++) {
            hundredArray[i-1] = i;
        }

        // Parse through the hundredArray.
        // If the number isPrime, print it. Else, do nothing.
        for(int i = 0; i < hundredArray.length; i++) {
            if(isPrime(hundredArray[i])){
                System.out.print(hundredArray[i] + " ");
            } else {
                System.out.print("");
            }
        }

    }
} // done