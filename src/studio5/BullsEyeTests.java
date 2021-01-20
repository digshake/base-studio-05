package studio5;

import edu.princeton.cs.introcs.StdDraw;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import support.cse131.ArgsProcessor;
import static org.junit.Assert.*;

/**
 * Methods that test the bullsEye() method
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BullsEyeTests {
    /**
     * Try a single large bull's eye that fills the window
     */
    @Test
    public void testLargeBullsEye() {
        StdDraw.clear();
        Methods.bullsEye(0.5,0.5, 0.5);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show a single bull's eye centered in the window\n" +
                                  "with an outer black ring, a smaller blue ring, an even smaller red\n" +
                                  "ring, and a yellow center, where all ring's lines have the same width?\n\n" +
                                  "Enter true or false:"));
    }
    /**
     * Try a bull's eye in the upper left of the sceen
     */
    @Test
    public void testUpperLeftBullsEye() {
        StdDraw.clear();
        Methods.bullsEye(0.25,0.75, 0.25);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean(
                "Does the screen show a single bull's eye filling the upper left\n" +
                "quadrant? (outer black ring, a smaller blue ring, an even smaller \n" +
                "red ring, and a yellow center, where all rings have the same width?\n\n" +
                "Enter true or false:"));
    }

    /**
     * Bull's eyes in all four corners
     */
    @Test
    public void testFourBullsEyes() {
        StdDraw.clear();
        Methods.bullsEye(0.25,0.75, 0.25);
        Methods.bullsEye(0.25,0.25, 0.25);
        Methods.bullsEye(0.75,0.75, 0.25);
        Methods.bullsEye(0.75,0.25, 0.25);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show four bull's\n" +
                                  "eyes, one filling each quadrant?\n\n" +
                                  "Enter true or false:"));
    }
    /**
     * Small bull's eye in bottom left
     */
    @Test
    public void testSmallBullsEye() {
        StdDraw.clear();
        Methods.bullsEye(0.75,0.25, 0.05);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show a small bull's\n" +
                                  "eyes, in the lower right quadrant?\n\n" +
                                  "Enter true or false:"));
    }
}
