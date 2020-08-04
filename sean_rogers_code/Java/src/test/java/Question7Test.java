import org.junit.Test;

public class Question7Test {
    @Test
    public void question7Test(){
        //Question 7 test
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
        Employee[] twoEmployees = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
        question7.sortTwoEmployees(twoEmployees);

        assert(expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge());
    }

    @Test
    public void question7Test2() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("aaaa", "aaad", 20), new Employee("aaab", "aaac", 20)};
        Employee[] twoEmployees = {new Employee("aaab", "aaac", 20), new Employee("aaaa", "aaad", 20)};
        question7.sortTwoEmployees(twoEmployees);
        assert(expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge());
    }

    @Test
    public void question7Test3() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
        Employee[] twoEmployees = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
        question7.sortTwoEmployees(twoEmployees);
        assert(expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge());
    }

    @Test
    public void question7Test4() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "efgh", 20)};
        Employee[] twoEmployees = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "efgh", 20)};
        question7.sortTwoEmployees(twoEmployees);
        assert(expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge());
    }

    @Test
    public void question7Test5() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "ffgh", 20)};
        Employee[] twoEmployees = {new Employee("bbcd", "ffgh", 20), new Employee("abcd", "efgh", 20)};
        question7.sortTwoEmployees(twoEmployees);
        assert(expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge());
    }

    @Test
    public void question7Test6() {
        Question7 question7 = new Question7();

        Employee[] expectedOutput = {new Employee("abcd", "efgh", 21), new Employee("bbcd", "ffgh", 20)};
        Employee[] twoEmployees = {new Employee("abcd", "efgh", 21), new Employee("bbcd", "efgh", 20)};
        question7.sortTwoEmployees(twoEmployees);
        assert(expectedOutput[0].getName().compareTo(twoEmployees[0].getName()) == 0 &&
                expectedOutput[0].getDepartment().compareTo(twoEmployees[0].getDepartment()) == 0 &&
                expectedOutput[0].getAge() == twoEmployees[0].getAge());
    }
}
