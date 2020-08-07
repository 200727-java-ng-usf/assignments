public class SubString {

    private String subString;
    
    
	public String getSubString() {
		return subString;
	}

	public void main(String input, int idx){
		this.subString = calculateSubString(input, idx);
    }

    private String calculateSubString(String str, int idx) {
        String newStr = "";
        for (int i = 0; i <= idx -1; i++)
            newStr += String.valueOf(str.charAt(i));
        System.out.println(newStr);
        return newStr;

    }
}