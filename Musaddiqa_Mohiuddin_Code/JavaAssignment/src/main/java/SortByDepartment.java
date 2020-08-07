import java.util.Comparator;

public class SortByDepartment implements Comparator<Employee> {

    // Used for sorting in ascending order

    public int compare(Employee a, Employee b) {
        return a.department.compareTo(b.department);
    }

}