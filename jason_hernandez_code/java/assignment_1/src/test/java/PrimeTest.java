import mainpackage.PrimeNumbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeTest {

        private PrimeNumbers sut;

        @Before
        public void setup() {
            sut = new PrimeNumbers();
        }

        @After
        public void teardown() {
            sut = null;
        }

        @Test
        public void sevenIsPrime() {
            boolean result = sut.isPrime(7);
            assertTrue(result);
        }

        @Test
        public void test1024NotPrime() {
            boolean result = sut.isPrime(1024);
            assertFalse(result);
        }

        @Test
        public void maxInteger() {
            boolean result = sut.isPrime(Integer.MAX_VALUE);
            assertTrue(result);
        }
    }


