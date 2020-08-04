package assignment.questions.question7;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Employee> reversed() {
        return null;
    }

    @Override
    public Comparator<Employee> thenComparing(Comparator<? super Employee> other) {
        return null;
    }

    @Override
    public <U> Comparator<Employee> thenComparing(Function<? super Employee, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Employee> thenComparing(Function<? super Employee, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Employee> thenComparingInt(ToIntFunction<? super Employee> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Employee> thenComparingLong(ToLongFunction<? super Employee> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Employee> thenComparingDouble(ToDoubleFunction<? super Employee> keyExtractor) {
        return null;
    }
}
