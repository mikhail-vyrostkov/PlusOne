import junit.framework.TestCase;

import java.util.Arrays;

public class PlusOneTest extends TestCase {

    public void testExample1() {
        int[] digits = {8, 9, 9, 9};
        int[] actualPrices = Main.Solution.plusOne(digits);
        int[] expectedPrices = {9, 0, 0, 0};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }

    public void testExample2() {
        int[] digits = {9, 9, 9, 9};
        int[] actualPrices = Main.Solution.plusOne(digits);
        int[] expectedPrices = {1, 0, 0, 0, 0};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(actualPrices));
    }
}
