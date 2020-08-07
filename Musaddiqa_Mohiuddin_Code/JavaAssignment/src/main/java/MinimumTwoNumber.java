
public class MinimumTwoNumber {
	private int result;
	
	
	public int getResult() {
		return result;
	}


	public void main(Integer i, Integer j) {

		 this.result = i < j ? i : (j >= i) ? i :j;

		System.out.println(result + " is a minimum value");
	}
}
