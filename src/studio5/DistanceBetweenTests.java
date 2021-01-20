package studio5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;


/**
 * Methods that test the distanceBetween() method
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DistanceBetweenTests {

    /**
     * Test the distance between (1,0) and (1,0) is ~0.0
     */
    @Test
    public void testDistanceBetweenSamePoints() {
        // The following is divided on three lines to make each part clearer.  See the comments on each
        assertEquals(0.0,                                       // The value we expect to get (to pass the test)
                      Methods.distanceBetween(1.0,0.0,1.0,0.0), // The thing to test
                1e-5);                                          // This uses double, which are imprecise, so
                                                                // the delta is used to decide how close is "close enough".
                                                                // In this case + or - 0.00001 is being used
    }

    /**
     * Test the distance between (1,0) and (2,0) is ~1.0
     */
    @Test
    public void testDistance1() {
        // Test that the distance between (1,0) and (2,0) is ~1.0
        assertEquals(1.0, Methods.distanceBetween(1.0,0.0,2.0,0.0), 1e-5);
    }

    /**
     * Test the distance between (0,1) and (0,-1) is ~2.0
     */
    @Test
    public void testDistance2() {
        // Test that the distance between (0,1) and (0,-1) is ~2.0
        assertEquals(2.0, Methods.distanceBetween(0.0,1.0,0.0,-1.0), 1e-5);
    }

    /**
     * Test the distance between (-1,-1) and (2,3) is ~5.0
     */
    @Test
    public void testDistance3() {
        // Test that the distance between (0,1) and (0,-1) is ~2.0
        assertEquals(5.0, Methods.distanceBetween(-1.0,-1.0,2.0,3.0), 1e-5);
    }

    /**
     * Test the distance between (-1,-1) and (2,3) is ~5.0
     */
    @Test
    public void testDistance4() {
        // TODO: FIXME!  This test has an error
        // Test that the distance between (0,0) and (30,40) is 50.0 (order of parameters matters!)
        assertEquals(50.0, Methods.distanceBetween(0.0,30.0,0.0,40.0), 1e-5);
    }



}
