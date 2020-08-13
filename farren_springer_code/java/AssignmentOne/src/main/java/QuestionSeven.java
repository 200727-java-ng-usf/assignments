import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class QuestionSeven implements Comparator<QuestionSeven> {

    // establish two employee objects with string, string, and int
    private String name;
    private String department;
    private int age;

    // main method
    public static void main(String[] args) {

        // Create an ArrayList object to store the employees
        ArrayList employeeArrayList = new ArrayList();

        QuestionSeven emp1 = new QuestionSeven("Susan", "Human Resources", 35);
        QuestionSeven emp2 = new QuestionSeven("Henry", "Public Relations", 32);

        // Add two employees to the ArrayList
        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);

        System.out.println("+----------------------+");

        System.out.println("Unsorted: ");
        employeeArrayList.forEach(System.out::println);

        Collections.sort(employeeArrayList, new QuestionSeven());

        System.out.println("Sorted: ");
        employeeArrayList.forEach(System.out::println);



    } // end main

    // no-args constructor
    public QuestionSeven() {
        this.name = "John";
        this.department = "Human Resources";
        this.age = 30;
    }

    // parameterized constructor
    public QuestionSeven(String name, String department, int age) {
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
    public int compare(QuestionSeven e1, QuestionSeven e2) {
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