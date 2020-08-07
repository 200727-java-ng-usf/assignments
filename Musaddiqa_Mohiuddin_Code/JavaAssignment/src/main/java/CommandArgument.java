public class CommandArgument {
    
	private String output;
	
	
	public String getOutput() {
		return output;
	}


	public void main(String input){

        for(int i = 0 ; i < input.length(); i++) {
            System.out.print(input.charAt(i));
        }
        this.output = input;

    }
}
