package mainpackage.comparators;

import mainpackage.EmployeeSort;

import java.util.Comparator;

public class EmployeeSortByAge implements Comparator<EmployeeSort> {

    public int compare(EmployeeSort a, EmployeeSort b)
    {
        return a.age - b.age;
    }
}
