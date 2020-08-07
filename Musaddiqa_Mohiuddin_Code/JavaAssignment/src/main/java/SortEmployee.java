import java.util.Collections;
import java.util.List;

public class SortEmployee {

	private List<Employee> sortedEmployee;
	
	
    public List<Employee> getSortedEmployee() {
		return sortedEmployee;
	}


	public void sortByAge (List<Employee> ar) {

        
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortByAge());

        System.out.println("Sorted by age");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        
        this.sortedEmployee = ar;

    }


	public void sortByName(List<Employee> ar) {
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByName());
		
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		this.sortedEmployee = ar;
		
	}
	
	public void sortByDepartment(List<Employee> ar) {
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByDepartment());
		
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		this.sortedEmployee = ar;
		
	}

}