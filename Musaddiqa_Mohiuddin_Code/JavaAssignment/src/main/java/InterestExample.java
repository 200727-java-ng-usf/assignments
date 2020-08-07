import java.util.Scanner;

public class InterestExample {
    
	private String interestCalculation;
	
	
	public String getInterestCalculation() {
		return interestCalculation;
	}


	public void main(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = Double.valueOf(in.nextLine());
        System.out.println("Enter rate of interest: " );
        int rate = Integer.valueOf(in.nextLine());
        System.out.println("Enter number of years: " );
        int years = Integer.valueOf(in.nextLine());

        System.out.println("Interest :" + principal * rate * years);
        in.close();
        this.interestCalculation = "Interest calculated";
    }
}