package com.revature;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Q13Tests {

    private Q13Tests sut;

    @BeforeClass
    public static void start() {
        System.out.println("Initiate testing...");
        System.out.println("+-----------------+");
    }

    @AfterClass
    public static void stop() {
        System.out.println("All tests complete.");
        System.out.println("+-----------------+");
    }

    @Before
    public void setUp() {
        sut = new Q13Tests();
        System.out.println("New Test");
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("End of test");
        System.out.println("+-----------------+");
    }

    @Test
    public void didIntSwitchFromZeroToOne() {

        // setting up and mocking possible inputs
        int a = 0;
        int b = 1;

        // instantiating a ArrayList numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // setting the first index value for loop logic
        numbers.add(0, a);

        // this loop is just for printing out the array after each value
        // is added to it's intended position
        for (int i = 0; i < 4; i++) {

            System.out.println(numbers);

            // nested if statements to determine if a or b should be added
            // to the first or last index of the array
            if (numbers.size() < 2) {
                numbers.add(0, b);
            } else if (numbers.size() == 2) {
                numbers.add(b);
            } else if (numbers.size() < 4){
                numbers.add(0, a);
            }
        }

        // setup the expected complete array to compare to the final numbers array
        // original found that numbers array was adding (and not printing) a 5th index when
        // we only wanted a size of 4
        ArrayList<Integer> expectedCompleteArray = new ArrayList<>();
        expectedCompleteArray.add(0);
        expectedCompleteArray.add(0, 1);
        expectedCompleteArray.add(1);
        expectedCompleteArray.add(0, 0);

        assertArrayEquals(expectedCompleteArray.toArray(), numbers.toArray());

    }

    @Test
    public void doesThisWorkWithSevenAndFive() {
        int a = 7;
        int b = 5;

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0, a);

        for (int i = 0; i < 4; i++) {

            System.out.println(numbers);

            if (numbers.size() < 2) {
                numbers.add(0, b);
            } else if (numbers.size() == 2) {
                numbers.add(b);
            } else if (numbers.size() < 4) {
                numbers.add(0, a);
            }
        }

        ArrayList<Integer> expectedCompleteArray = new ArrayList<>();
        expectedCompleteArray.add(7);
        expectedCompleteArray.add(0, 5);
        expectedCompleteArray.add(5);
        expectedCompleteArray.add(0, 7);

        assertArrayEquals(expectedCompleteArray.toArray(), numbers.toArray());

    }


}
