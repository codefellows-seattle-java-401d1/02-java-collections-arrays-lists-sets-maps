package ArraysOfArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysOfArraysTest {

    @Test
    // same sized arrays
    void averagesOfTemperature() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        };
        int[] actual = ArraysOfArrays.averagesOfArray(weeklyMonthTemperatures);
        int[] expected = {55, 54, 60, 53, 59, 57, 61};

        assertArrayEquals(expected, actual);
    }

    @Test
    // staggared arrays
    void averagesOfStaggeredArrays() {
        int[][] arraySet = {
                {1, 2, 3},
                {2, 2, 6, 7, 9},
                {0, 1,  99},
                {1, 1, 1},
                {0,0,15},
        };
        int[] actual = ArraysOfArrays.averagesOfArray(arraySet);
        int[] expected = {1, 1, 1};

        assertArrayEquals(expected, actual);
    }

    @Test
        // empty arrays in array
    void averageOfDuplicateArrays() {
        int[][] arraySet = {
                {0},
                {0},
                {0},
                {0},
                {0},
        };
        int[] actual = ArraysOfArrays.averagesOfArray(arraySet);
        int[] expected = {0};

        assertArrayEquals(expected, actual);
    }

    @Test
        // empty array
    void emptyArray() {
        int[][] arraySet = {
        };
        int[] actual = ArraysOfArrays.averagesOfArray(arraySet);
        int[] expected = {0};

        assertArrayEquals(expected, actual);
    }
}