package mainpackage.comparators;

import mainpackage.EmployeeSort;

import java.util.Comparator;

public class EmployeeSortByDepartment implements Comparator<EmployeeSort> {

    public int compare(EmployeeSort a, EmployeeSort b)
    {
        return a.department.compareTo(b.department);
    }
}
