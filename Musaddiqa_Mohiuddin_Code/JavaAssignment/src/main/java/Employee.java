public class Employee {

    String name;
    String department;
    int age;

    public Employee(String name, String department, int age) {
        super();
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.department + " " + this.name +
                " " + this.age;
    }



}