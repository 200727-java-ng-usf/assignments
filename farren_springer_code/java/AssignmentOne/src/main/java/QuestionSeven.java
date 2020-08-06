import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.*;
import java.lang.*;


public class QuestionSeven {

    // establish two employee objects with string, string, and int
    private String name;
    private String department;
    private int age;

    // main method
    public static void main(String[] args) {

        // Create an ArrayList object to store the employees
        ArrayList employeeArray = new ArrayList();

        // Add two employees to the ArrayList
        employeeArray.add(new QuestionSeven("Susan", "Human Resources", 27));
        employeeArray.add(new QuestionSeven("Henry", "Public Relations", 32));

        System.out.println("+----------------------+");
        for (int i = 0; i < employeeArray.size(); i++) {
            System.out.println(employeeArray.get(i));
        }

    }

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

} // not done. Implement Comparator Interface