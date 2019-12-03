import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AmazonTest {
    private int[] input;
    private Amazon amazon;

    @Before
    public void createInputArray () {
        amazon = new Amazon();
        input = new int[]{0, 1, 0, 1, 0, 1};
    }

    @Test
    public void result_OneDayTest() {
        int [] expectedResult = {0, 1, 1, 1, 1, 1};
        int[] arr = amazon.result(input, 1);
        assertTrue(Arrays.equals(expectedResult, arr));
    }

    @Test
    public void result_TwoDaysTest() {
        int [] expectedResult = {0, 0, 1, 1, 1, 0};
        int[] arr = amazon.result(input, 2);
        assertTrue(Arrays.equals(expectedResult, arr));
    }

    @Test
    public void result_ThreeDaysTest() {
        int [] expectedResult = {1, 0, 0, 1, 0, 0};
        int[] arr = amazon.result(input, 3);
        assertTrue(Arrays.equals(expectedResult, arr));
    }
}