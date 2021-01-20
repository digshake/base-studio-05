package studio5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

/**
 * Methods that test the filledArray() method
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FilledArrayTests {
    /**
     * Test that it return an empty array for size 0
     */
    @Test
    public void testSizeZero() {
        int[] result = Methods.filledArray(0, 12);
        assertTrue(result.length == 0);
    }

    /**
     * Test that it return an empty array for size 0
     */
    @Test
    public void testSizeFive() {
        int[] result = Methods.filledArray(5, 6);

        assertTrue(result.length == 4);   // Incorrect: FIXME!
        for (int i = 0; i < result.length; i++) {
            assertEquals(6, result[i]);
        }
    }

    /**
     * Test that it return an empty array for size 0
     */
    @Test
    public void testSizeSixty() {
        int[] result = Methods.filledArray(60, -6);

        assertTrue(result.length == 60);
        for (int i = 0; i < result.length; i++) {
            assertEquals(-6, result[i]);
        }

    }
}