import java.util.Comparator;

public class Q7EmployeeComparator implements Comparator<Q7Employee>{

    @Override
    public int compare(Q7Employee o1, Q7Employee o2) {
        // Compare name first
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else { // Compare Department next
            if (o1.getDepartment().compareTo(o2.getDepartment()) > 0) {
                return 1;
            } else if (o1.getDepartment().compareTo(o2.getDepartment()) < 0) {
                return -1;
            } else { // Compare age next
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
