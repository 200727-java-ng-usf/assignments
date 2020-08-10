import org.junit.Test;

import java.util.Arrays;

public class Question7Test {
    @Test
    public void test2EmployeesAlreadySorted(){
        //Question 7 test
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
        Employee[] twoEmployees = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
        Arrays.sort(twoEmployees, new Question7());

        assert((expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge()) &&
                expectedOutput[1].getName().compareTo(twoEmployees[1].getName()) == 0 &&
                expectedOutput[1].getDepartment().compareTo(twoEmployees[1].getDepartment()) == 0 &&
                expectedOutput[1].getAge() == twoEmployees[1].getAge());
    }

    @Test
    public void testTwoEmployeesSortByName() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("aaaa", "aaad", 20), new Employee("aaab", "aaac", 20)};
        Employee[] twoEmployees = {new Employee("aaab", "aaac", 20), new Employee("aaaa", "aaad", 20)};
        Arrays.sort(twoEmployees, new Question7());
        assert((expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge()) &&
                expectedOutput[1].getName().compareTo(twoEmployees[1].getName()) == 0 &&
                expectedOutput[1].getDepartment().compareTo(twoEmployees[1].getDepartment()) == 0 &&
                expectedOutput[1].getAge() == twoEmployees[1].getAge());
    }

    @Test
    public void testTwoEmployeesWithSameNameSortedDepartmentDifferentAge() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
        Employee[] twoEmployees = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
        Arrays.sort(twoEmployees, new Question7());
        assert((expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge()) &&
                expectedOutput[1].getName().compareTo(twoEmployees[1].getName()) == 0 &&
                expectedOutput[1].getDepartment().compareTo(twoEmployees[1].getDepartment()) == 0 &&
                expectedOutput[1].getAge() == twoEmployees[1].getAge());
    }

    @Test
    public void testTwoEmployeesSameNameSameDepartmentSoSortByAge() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("abcd", "efgh", 21), new Employee("abcd", "efgh", 20)};
        Employee[] twoEmployees = {new Employee("abcd", "efgh", 20), new Employee("abcd", "efgh", 21)};
        //question7.sortTwoEmployees(twoEmployees);
        Arrays.sort(twoEmployees, new Question7());
        assert(!((expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge()) &&
                expectedOutput[1].getName().compareTo(twoEmployees[1].getName()) == 0 &&
                expectedOutput[1].getDepartment().compareTo(twoEmployees[1].getDepartment()) == 0 &&
                expectedOutput[1].getAge() == twoEmployees[1].getAge()));
    }
}
