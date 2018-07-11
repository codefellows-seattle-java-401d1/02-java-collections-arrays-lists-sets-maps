import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class ArraysAveragerTest {

    @Test
    void arraysAverager() {
        int[][] input = {{1}};
        int[] expected = {1};
        assertArrayEquals(expected,ArraysAverager.arraysAverager(input));
    }

    @Test
    void arraysAverager1() {
        int[][] input = {{1,8,6},{1,1,1},{15,17}};
        int[] expected = {15,17};
        assertArrayEquals(expected,ArraysAverager.arraysAverager(input));
    }

    @Test
    void arraysAverager2() {
        int[][] input = {{}};
        int[] expected = {};
        assertArrayEquals(expected,ArraysAverager.arraysAverager(input));
    }
}