import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	private SortEmployee sortEmployee;
	private List<Employee> ar ;
	
	@Before
	public void setUp() {
		ar = new ArrayList<Employee>();
        ar.add(new Employee("Civil", "Ashok", 32));
        ar.add(new Employee("Security", "Bala", 20));
        ar.add(new Employee("NetWork", "Samu", 30));
        sortEmployee = new SortEmployee();
	}
	
	@Test
	public void sortByNameTest() {
		
		sortEmployee.sortByName(ar);
		Collections.sort(ar, new SortByName());
		assertEquals(ar, sortEmployee.getSortedEmployee());
	}
	
	@Test
	public void sortByAgeTest() {
		
		sortEmployee.sortByAge(ar);
		Collections.sort(ar, new SortByAge());
		assertEquals(ar, sortEmployee.getSortedEmployee());
	}
	@Test
	public void sortByDepartmentTest() {
		
		sortEmployee.sortByDepartment(ar);
		Collections.sort(ar, new SortByDepartment());
		assertEquals(ar, sortEmployee.getSortedEmployee());
	}
	
	//negative Case
	@Test(expected = NullPointerException.class)
	public void negativeTestScenario() {
		
		sortEmployee.sortByDepartment(null);
		//Collections.sort(ar, new SortByDepartment());
	}
	

}
