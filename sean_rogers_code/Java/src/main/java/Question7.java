import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Question7 implements Comparator {

    /**
     * Sorts two employees beginning with their name, then department, then age
     *
     * They are swapped according to their name.
     * If their are equal match, they're swapped according to their department
     * If their departments and names are equal, they're swapped according to their age.
     * @param twoEmployees
     */
    public void sortTwoEmployees(Employee[] twoEmployees) {

        // display each employee before the sort
        System.out.print("INITIAL employee1 " + twoEmployees[0].getName() + " " + twoEmployees[0].getDepartment() + " " + twoEmployees[0].getAge() + " ");
        System.out.println("INITIAL employee2 " + twoEmployees[1].getName() + " " + twoEmployees[1].getDepartment() + " " + twoEmployees[1].getAge());
        if(compare(twoEmployees[0], twoEmployees[1]) > 0) {
            Employee temp = twoEmployees[0];
            twoEmployees[0] = twoEmployees[1];
            twoEmployees[1] = temp;
        }

        System.out.print("FINAL employee1 " + twoEmployees[0].getName() + " " + twoEmployees[0].getDepartment() + " " + twoEmployees[0].getAge() + " ");
        System.out.println("FINAL employee2 " + " " + twoEmployees[1].getName() + " " + twoEmployees[1].getDepartment() + " " + twoEmployees[1].getAge());

    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee)o1;
        Employee e2 = (Employee)o2;
        /*if(e1.getName().compareTo(e2.getName()) < 0)
            return -1;
        if(e1.getName().compareTo(e2.getName()) == 0) {
            if(e1.getDepartment().compareTo(e2.getDepartment()) < 0) {
                return -1;
            }
            if(e1.getDepartment().compareTo(e2.getDepartment()) == 0) {
                if(e1.getAge() < e2.getAge()) {
                    return -1;
                }
                if(e1.getAge() == e2.getAge()) {
                    return 0;
                }
                if(e1.getAge() > e2.getAge()) {
                    return 1;
                }
            }
            if(e1.getDepartment().compareTo(e2.getDepartment()) == 1) {
                return 1;
            }
        }
        return 1;*/

        // compare employee names first
        if(e1.getName().compareTo(e2.getName()) < 0)
            return -1;
        if(e1.getName().compareTo(e2.getName()) > 0)
            return 1;

        // if employee names are equal, compare employee departments
        if(e1.getDepartment().compareTo(e2.getDepartment()) < 0)
            return -1;
        if(e1.getDepartment().compareTo(e2.getDepartment()) > 0)
            return 1;

        // if employee departments are equal, compare employee ages
        if(e1.getAge() < e2.getAge())
            return -1;
        if(e1.getAge() > e2.getAge())
            return 1;

        // return 0 if all Employee properties are equal. At this point, they all will be.
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
}
