import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class ArraysAveragerTest {

    @Test
    void arraysAverager() {
        int[][] input = {{1}};
        double[] expected = {1};
        assertArrayEquals(expected,ArraysAverager.arraysAverager(input));
    }

    @Test
    void arraysAverager1() {
        int[][] input = {{1,8,6},{1,1,1},{15,17}};
        double[] expected = {5,1,16};
        assertArrayEquals(expected,ArraysAverager.arraysAverager(input));
    }

    @Test
    void arraysAverager2() {
        int[][] input = {{}};
        double[] expected = {NaN};
        assertArrayEquals(expected,ArraysAverager.arraysAverager(input));
    }
}