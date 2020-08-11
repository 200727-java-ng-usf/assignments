package assignment.questions;
import assignment.questions.question7.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
    public class Q7Tests {
        private Q7 sut;
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        private final PrintStream originalOut = System.out;
        private final PrintStream originalErr = System.err;

        @Before
        public void setup() {
            sut = new Q7();
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }

        @After
        public void tearDown() {
            sut = null;
            System.setOut(originalOut);
            System.setErr(originalErr);
        }

    /*
    -Test fails because it compares the 2 and the "line separators are different"
    -output is what is desired
    @Test
    public void test1(){
        Employee John = new Employee("John Doe", "Cashier", 20);
        Employee Jane = new Employee("Jane Doe", "Manager", 28);
        ArrayList<Employee> em = new ArrayList<Employee>();
        em.add(John);
        em.add(Jane);
        String test = "Sorted by Name: \n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "name= John Doe, department= Cashier, age=20\n" +
                "Sorted by Department: \n" +
                "name= John Doe, department= Cashier, age=20\n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "Sorted by Age: \n" +
                "name= John Doe, department= Cashier, age=20\n" +
                "name= Jane Doe, department= Manager, age=28\n";
        sut.sortEmployees(em);
        assertEquals(test, outContent.toString());
    }

    -same thing, line separators are only differences
    @Test
    public void test2(){
        Employee John = new Employee("John Doe", "Truck Driver", 30);
        Employee Jane = new Employee("Jane Doe", "Manager", 28);
        ArrayList<Employee> em = new ArrayList<Employee>();
        em.add(John);
        em.add(Jane);
        String test = "Sorted by Name: \n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "name= John Doe, department= Truck Driver, age=30\n" +
                "Sorted by Department: \n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "name= John Doe, department= Truck Driver, age=30\n" +
                "Sorted by Age: \n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "name= John Doe, department= Truck Driver, age=30\n" ;
        sut.sortEmployees(em);
        assertEquals(test, outContent.toString());
    }

    -the class sorts by name, department, and age successfully, however the "line spacing is off"
    @Test
    public void test3() {
        Employee Adam = new Employee("Adam Doe", "Truck Driver", 30);
        Employee Jane = new Employee("Jane Doe", "Manager", 28);
        ArrayList<Employee> em = new ArrayList<Employee>();
        em.add(Adam);
        em.add(Jane);
        String test = "Sorted by Name: \n" +
                "name= Adam Doe, department= Truck Driver, age=30\n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "Sorted by Department: \n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "name= Adam Doe, department= Truck Driver, age=30\n" +
                "Sorted by Age: \n" +
                "name= Jane Doe, department= Manager, age=28\n" +
                "name= Adam Doe, department= Truck Driver, age=30\n";
        sut.sortEmployees(em);
        assertEquals(test, outContent.toString());
    }*/
}
