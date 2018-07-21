package day3;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
class ArrayOfArraysTest {
    @Test
    void averageWeeklyTemperatures() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String result = Arrays.toString(ArraysOfArrays.findAvg(weeklyMonthTemperatures));
        String expected = Arrays.toString(new int[] {55, 54, 60, 53, 59, 57, 61});
        assertEquals(expected, result);
    }
    @Test
    void averageWeeklyTemperatures2() {
        int[][] weeklyMonthTemperatures = {
                {10, 12, 13, 24, 15, 26, 17},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String result = Arrays.toString(ArraysOfArrays.findAvg(weeklyMonthTemperatures));
        String expected = Arrays.toString(new int[] {10, 12, 13, 24, 15, 26, 17});
        assertEquals(expected, result);
    }
    @Test
    void averageWeeklyTemperaturesDoubled() {
        int[][] weeklyMonthTemperatures = {
                {99, 97, 84, 56, 45, 85, 23, 72, 21, 13, 68, 53, 26, 17},
                {57, 65, 65, 70, 72, 65, 51, 47, 15, 95, 80, 82, 53, 74},
                {55, 54, 60, 53, 59, 57, 61, 92, 83, 70, 79, 86, 97, 91},
                {12, 29, 18, 11, 23, 21, 41, 12, 34, 25, 14, 25, 43, 19}
        };
        String result = Arrays.toString(ArraysOfArrays.findAvg(weeklyMonthTemperatures));
        String expected = Arrays.toString(new int[] {12, 29, 18, 11, 23, 21, 41, 12, 34, 25, 14, 25, 43, 19});
        assertEquals(expected, result);
    }
}