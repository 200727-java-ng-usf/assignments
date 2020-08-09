package com.revature;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.*;

import static org.junit.Assert.*;

public class Q12Tests {

    // Creating the test system
    private Q12Main sut;

    @BeforeClass
    public static void start() {
        System.out.println("Initiate test...");
        System.out.println("+-----------------+");
    }

    @AfterClass
    public static void stop() {
        System.out.println("All tests complete.");
        System.out.println("+-----------------+");
    }

    @Before
    public void setUp() {
        sut = new Q12Main();
        System.out.println("New Test");
    }

    @After
    public void tearDown() {
        sut = null;
        System.out.println("End of test");
        System.out.println("+-----------------+");
    }

    // This tests whether the array got instantiated and that
    // the createArray method filled it's indices 1-100
    @Test
    public void didTheArrayInitiate() {
        int[] arrAfter = new int[100];
        for (int i = 0; i < 100; i++) {
            arrAfter[i] = i + 1;
        }
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                         31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58,
                         59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86,
                         87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        Assert.assertArrayEquals(arrAfter, expected);
    }



    // This method looks through int[] arr and if an even number is found,
    // it will be printed to the console.
    @Test
    public void didOnlyEvenNumbersPrint() {
        // Initiating a random array
        int[] arr = {1, 2, 3, 5, 6, 9, 12};
        int[] expectedResult = {2, 6, 12};
        int[] result = new int[expectedResult.length];
        int indexCount = 0;

        for (int evenNum : arr) {
            if (evenNum % 2 == 0) {
                result[indexCount] = evenNum;
                indexCount++;
            }
        }
        assertArrayEquals(expectedResult, result);
    }
}