import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Assignment1TestDriver {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Assignment1TestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("LSKDJFLKSDJFKL");
        System.out.println(result.wasSuccessful());
        /*
        System.out.println("BEGINNING ASSIGNMENT1 TESTS");

        Result result = JUnitCore.runClasses(Assignment1TestSuite.class);

        if(result.getFailures().size() == 0) {
            System.out.println("ALL TESTS PASSED!");
        } else {
            System.out.println("Tests failed:");
            for(Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }

        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());*/
    }
}
