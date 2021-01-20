package studio5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

/**
 * Methods that test the filledArray() method
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayMeanTests {
    /**
     * Test the mean of {1}
     */
    @Test
    public void testMeanOfOne() {
        int[] testArray = {1};
        assertEquals(1.0, Methods.arrayMean(testArray), 1e-5);
    }

    /**
     * Test the mean of {2}
     */
    @Test
    public void testMeanOfTwo() {
        int[] testArray = {2};
        assertEquals(2.0, Methods.arrayMean(testArray), 1e-5);
    }

    /**
     * Test the mean of {1,2}
     */
    @Test
    public void testMeanOfOneTwo() {
        int[] testArray = {1,2};
        assertEquals(1.5, Methods.arrayMean(testArray), 1e-5);
    }
}
