import java.util.ArrayList;
import java.util.List;

public class EvenNumber {

	private List<Integer> evenList;
	
	public List<Integer> getNumberList() {
		return evenList;
	}

	public void main(List<Integer> inputData){

        //Empty String
        List<Integer> numberList = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++)  {
            numberList.add(i);
        }

        for(Integer number : inputData) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                numberList.add(number);
            }
        }
        this.evenList = numberList;

    }
}