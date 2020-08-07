public class EvenOrOddNumber {
    
	private String outputValue;
    
    public String getOutputValue() {
    	return outputValue;
    }
    
	static boolean isEven(int n)
    {
        boolean isEven = true;

        for (int i = 1; i <= n; i++)
            isEven = !isEven;

        return isEven;
    }

    public void main(Integer n)
    {

        if(isEven(n)) {
        	this.outputValue = "Even";
        }else {
        	this.outputValue = "Odd";
        }
        System.out.println(outputValue);
        
        

    }
}