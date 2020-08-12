//package com.revature;
//
//import org.junit.*;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//
//import static org.junit.Assert.assertEquals;
//
//public class Q7Tests {
//
//    private Q7Main sut;
//
//    @BeforeClass
//    public static void beforeTests() {
//        System.out.println("Begin testing of Q17 Methods");
//        System.out.println("+-------------------------------------+");
//    }
//
//    @AfterClass
//    public static void afterTests() {
//        System.out.println("Testing complete, exiting program.");
//        System.out.println("+-------------------------------------+");
//    }
//
//    @Before
//    public void setUp() {
//        sut = new Q7Main();
//    }
//
//    @After
//    public void tearDown() {
//        sut = null;
//    }
//
//    @Test
//    public void compareFirstName() {
//
//        String firstName;
//        String lastName;
//        String dept;
//        int age;
//
//        ArrayList<Object> emp = new ArrayList<>();
//        emp.add(new Q7Main("John", "Smith", "Training", 28));
//        emp.add(new Q7Main("Greg", "Deck", "Sales", 32));
//
//        System.out.println("Unsorted:");
//        for (Object employee : emp) {
//            System.out.println(employee);
//        }
//
//
//
//    }
//
//    @Test
//    public void compareLastName() {
//
//    }
//
//    @Test
//    public void compareDept() {
//
//    }
//
//    @Test
//    public void compareAge() {
//
//    }
//
//}
//

