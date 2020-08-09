package com.revature;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class Q18Tests {

    private Q18Main sut;

    @BeforeClass
    public static void beforeTests() {
        System.out.println("Begin testing of Q18 Methods");
        System.out.println("+-------------------------------------+");
    }

    @AfterClass
    public static void afterTests() {
        System.out.println("Testing complete, exiting program.");
        System.out.println("+-------------------------------------+");
    }

    @Before
    public void setUp() {
        sut = new Q18Main();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void doesTheStringHaveUpperCase() {
        String string1 = ("hg2");
        boolean areThereUpperCases = false;

        char[] stringChars = string1.toCharArray();

        for (char stringChar : stringChars) {

            if (Character.isUpperCase(stringChar)) {
                areThereUpperCases = true;
            }
        }
        System.out.println("Are there uppercase letters: " + areThereUpperCases);
    }

    @Test
    public void convertLowerToUpperCase() {

        String string1 = ("AbCdEfG1@3$5^");

        char[] stringChars = string1.toCharArray();
        char[] newString = new char[string1.length()];

        for (int i = 0; i < string1.length(); i++) {

            if (Character.isLowerCase(stringChars[i])) {
                newString[i] = Character.toUpperCase(stringChars[i]);
            } else
                newString[i] = stringChars[i];
            }
        System.out.println(newString);


    }

    @Test
    public void convertInputStringToIntPlus10() {

        String string1 = ("303");

        int result = Integer.parseInt(string1) + 10;

        System.out.println(result);

        // standard test comparison
        int expectedValue = 313;
        int actualValue = result;
        assertEquals(expectedValue, actualValue);

    }

}
