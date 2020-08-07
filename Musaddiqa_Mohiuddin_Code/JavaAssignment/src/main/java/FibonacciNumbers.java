import com.sun.media.sound.InvalidDataException;

public class FibonacciNumbers {
    private String outputData="";
    public String getOutputData() {
        return outputData;
    }

    int n1=0,n2=1,n3=0;
    private String printFibonacci(int count, String outputData) throws InvalidDataException {
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            outputData += " "+n3;
            outputData = printFibonacci(count-1, outputData);
        }
        return outputData;
    }
    public String main(int count) throws InvalidDataException {


        if(count <=0) {
            throw new InvalidDataException();
        }
        outputData += n1 + " "+n2;
        System.out.print(n1+" "+n2);//printing 0 and 1

        outputData = printFibonacci(count-2, outputData);//n-2 because 2 numbers are already printed
        return outputData;
    }
}




