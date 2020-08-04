import org.junit.Test;

public class Question7Test {
    @Test
    public void question7Test(){
        //Question 7 test
        Question7 question7 = new Question7();

        Employee[] expectedOutput1 = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
        Employee[] twoEmployees1 = {new Employee("aaaa", "aaac", 20), new Employee("aaab", "aaad", 20)};
        question7.sortTwoEmployees(twoEmployees1);

        assert(expectedOutput1[0].getName().compareTo(twoEmployees1[0].getName()) == 0 &&
                expectedOutput1[0].getDepartment().compareTo(twoEmployees1[0].getDepartment()) == 0 &&
                expectedOutput1[0].getAge() == twoEmployees1[0].getAge());

        Employee[] expectedOutput2 = {new Employee("aaaa", "aaad", 20), new Employee("aaab", "aaac", 20)};
        Employee[] twoEmployees2 = {new Employee("aaab", "aaac", 20), new Employee("aaaa", "aaad", 20)};
        question7.sortTwoEmployees(twoEmployees2);
        assert(expectedOutput2[0].getName().compareTo(twoEmployees2[0].getName()) == 0 &&
                expectedOutput2[0].getDepartment().compareTo(twoEmployees2[0].getDepartment()) == 0 &&
                expectedOutput2[0].getAge() == twoEmployees2[0].getAge());

        Employee[] expectedOutput3 = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
        Employee[] twoEmployees3 = {new Employee("aaaa", "aaac", 21), new Employee("aaaa", "aaad", 20)};
        question7.sortTwoEmployees(twoEmployees3);
        assert(expectedOutput3[0].getName().compareTo(twoEmployees3[0].getName()) == 0 &&
                expectedOutput3[0].getDepartment().compareTo(twoEmployees3[0].getDepartment()) == 0 &&
                expectedOutput3[0].getAge() == twoEmployees3[0].getAge());

        Employee[] expectedOutput4 = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "efgh", 20)};
        Employee[] twoEmployees4 = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "efgh", 20)};
        question7.sortTwoEmployees(twoEmployees4);
        assert(expectedOutput4[0].getName().compareTo(twoEmployees4[0].getName()) == 0 &&
                expectedOutput4[0].getDepartment().compareTo(twoEmployees4[0].getDepartment()) == 0 &&
                expectedOutput4[0].getAge() == twoEmployees4[0].getAge());

        Employee[] expectedOutput5 = {new Employee("abcd", "efgh", 20), new Employee("bbcd", "ffgh", 20)};
        Employee[] twoEmployees5 = {new Employee("bbcd", "ffgh", 20), new Employee("abcd", "efgh", 20)};
        question7.sortTwoEmployees(twoEmployees5);
        assert(expectedOutput5[0].getName().compareTo(twoEmployees5[0].getName()) == 0 &&
                expectedOutput5[0].getDepartment().compareTo(twoEmployees5[0].getDepartment()) == 0 &&
                expectedOutput5[0].getAge() == twoEmployees5[0].getAge());

        Employee[] expectedOutput6 = {new Employee("abcd", "efgh", 21), new Employee("bbcd", "ffgh", 20)};
        Employee[] twoEmployees6 = {new Employee("abcd", "efgh", 21), new Employee("bbcd", "efgh", 20)};
        question7.sortTwoEmployees(twoEmployees6);
        assert(expectedOutput6[0].getName().compareTo(twoEmployees6[0].getName()) == 0 &&
                expectedOutput6[0].getDepartment().compareTo(twoEmployees6[0].getDepartment()) == 0 &&
                expectedOutput6[0].getAge() == twoEmployees6[0].getAge());
    }
}
