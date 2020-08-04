import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.*;
import java.lang.*;


public class QuestionSeven implements Comparator {

    // establish two employee objects with string, string, and int
    private String name;
    private String department;
    private int age;

    // main method
    public static void main(String[] args) {
        QuestionSeven employee1 = new QuestionSeven("Bill", "Management", 37);
        System.out.println(employee1.getName()); // test

        ArrayList employeeArray = new ArrayList();
        employeeArray.add(new QuestionSeven("Karen", "Human Resources", 27));
        employeeArray.add(new QuestionSeven("Henry", "Public Relations", 32));
        employeeArray.add(new QuestionSeven("Rebecca", "Accounting", 41));

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

    // Comparator method overrides
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public Comparator reversed() {
        return null;
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return null;
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return null;
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return null;
    }
} // not done