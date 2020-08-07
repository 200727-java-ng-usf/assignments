public class ReverseString {

	private String reverseString;
	
	
	public String getReverseString() {
		return reverseString;
	}


	public void main(String input){
        String output = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
            output +=input.charAt(i);
        }
        this.reverseString = output;
    }
}