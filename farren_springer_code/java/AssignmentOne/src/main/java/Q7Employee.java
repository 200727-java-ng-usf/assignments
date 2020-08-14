import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This class is a POJO that uses the comparator interface to
 * compare two Q7Employee objects.
 */
public class Q7Employee implements Comparator<Q7Employee> {

    /**
     * Creates private fields for Q7Employee objects.
     */
    private String name;
    private String department;
    private int age;

    public static void main(String[] args) {

        /**
         * Creates an ArrayList object to store the employees.
         */
        ArrayList employeeArrayList = new ArrayList();

        /**
         * Instantiates two Q7Employee objects.
         */
        Q7Employee emp1 = new Q7Employee("Susan", "Human Resources", 35);
        Q7Employee emp2 = new Q7Employee("Henry", "Public Relations", 32);

        /**
         * Adds the new employees to the employeeArrayList.
         */
        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);

        /**
         * Prints the unsorted ArrayList to the console.
         */
        System.out.println("Unsorted: ");
        employeeArrayList.forEach(System.out::println);

        /**
         * The sort method uses the comparator object from
         * Q7EmployeeComparator to sort the list.
         */
        Collections.sort(employeeArrayList, new Q7Employee());

        System.out.println("Sorted: ");
        employeeArrayList.forEach(System.out::println);



    } // end main

    // no-args constructor
    public Q7Employee() {
        this.name = "John";
        this.department = "Human Resources";
        this.age = 30;
    }

    // parameterized constructor
    public Q7Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    // getters and setters for all private variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // custom toString
    @Override
    public String toString() {
        return "QuestionSeven{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Q7Employee e1, Q7Employee e2) {
        // Compare name first
        if (e1.getName().compareTo(e2.getName()) > 0) {
            return 1;
        } else if (e1.getName().compareTo(e2.getName()) < 0) {
            return -1;
        } else { // Compare Department next
            if (e1.getDepartment().compareTo(e2.getDepartment()) > 0) {
                return 1;
            } else if (e1.getDepartment().compareTo(e2.getDepartment()) < 0) {
                return -1;
            } else { // Compare age next
                if (e1.getAge() > e2.getAge()) {
                    return 1;
                } else if (e1.getAge() < e2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

    } // end compare





} // end class
// done