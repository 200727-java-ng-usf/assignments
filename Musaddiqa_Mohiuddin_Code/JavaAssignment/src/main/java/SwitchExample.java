import java.util.Date;

public class SwitchExample {

    private String output;
    
    
	public String getOutput() {
		return output;
	}


	public void main(Integer caseNumber){

        double a = 10;
        // switch statement with int data type
        switch (caseNumber) {
            case 1:
                System.out.print(Math.sqrt(a));
                this.output = String.valueOf(Math.sqrt(a));
                break;
            case 2:
                System.out.println(new Date());
                this.output = String.valueOf(new Date());
                break;
            case 3:
                String name = "I am learning Core Java";
                String[] splitArray = name.split(" ");
                for(int i = 0; i< splitArray.length; i++) {
                    System.out.print(splitArray[i] + " ");
                }
                this.output = name;
                break;
            default :
            	throw new NullPointerException();
        }
    }
}  