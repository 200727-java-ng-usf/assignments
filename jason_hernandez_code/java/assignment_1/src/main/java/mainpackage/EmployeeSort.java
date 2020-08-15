package mainpackage;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class EmployeeSort  {

    // First create the params
    public String name;
    public String department;
    public int age;

    // Plug the params into the variable
    public EmployeeSort(String n, String d, int a) {
        this.name = n;
        this.department = d;
        this.age = a;
    }

    @Override
    public String toString() {
        return "EmployeeSort{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
