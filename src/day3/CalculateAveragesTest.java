package day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingAveragesTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        double average = CalculateAverages.calculateAverage(arr);
        int expected = 0;

        assertEquals(expected, average);
    }

    @Test
    void containsDuplicates() {
        int[] arr = {10, 10, 10, 10, 100};
        double average = CalculateAverages.calculateAverage(arr);
        int expected = 28;

        assertEquals(expected, average);
    }

}