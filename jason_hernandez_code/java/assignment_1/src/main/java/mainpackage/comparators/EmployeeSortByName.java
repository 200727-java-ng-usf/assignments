package mainpackage.comparators;

import mainpackage.EmployeeSort;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<EmployeeSort> {

    public int compare(EmployeeSort a, EmployeeSort b)
    {
        return a.name.compareTo(b.name);
    }
}
