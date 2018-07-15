package CalculatingAverages;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class CalculatingAveragesTest {

    @Test
    void averageOfSmallArray() {
        int[] originalArray = {1, 2, 3};
        double actual = CalculatingAverages.calculatingArrayAverages(originalArray);

        double expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void averageOfLargeArray() {
        int[] originalArray = {100, 200, 300, 400, 500, 600, 700, 800, 900};
        double actual = CalculatingAverages.calculatingArrayAverages(originalArray);

        double expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    void averageOfOne() {
        int[] originalArray = {1};
        double actual = CalculatingAverages.calculatingArrayAverages(originalArray);

        double expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void averageEmptyArray() {
        int[] originalArray = {};
        double actual = CalculatingAverages.calculatingArrayAverages(originalArray);

        double expected = NaN;

        assertEquals(expected, actual);
    }
}