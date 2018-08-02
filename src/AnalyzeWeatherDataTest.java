import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzeWeatherDataTest {

    @Test
    void analyzeWeatherData() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String result = Arrays.toString(ArrayOfArrays.findAvg(weeklyMonthTemperatures));
        String expected = Arrays.toString(new int[]{55, 54, 60, 53, 59, 57, 61});

        assertEquals(expected, result);
    }


    @Test
    void analyzeWeatherData2() {
        int[][] weeklyMonthTemperatures = {
                {10, 12, 13, 24, 15, 26, 17},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String result = Arrays.toString(ArrayOfArrays.findAvg(weeklyMonthTemperatures));
        String expected = Arrays.toString(new int[]{10, 12, 13, 24, 15, 26, 17});

        assertEquals(expected, result);
    }
}