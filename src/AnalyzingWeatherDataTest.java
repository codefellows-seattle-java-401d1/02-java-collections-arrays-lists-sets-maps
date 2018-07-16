import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzingWeatherDataTest {

    @Test
    public void analyzeWeatherTest() {
        int[][] array = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {55, 54, 60, 53, 59, 57, 61},
                {55, 54, 60, 53, 59, 57, 61},
                {55, 100, 60, 53, 59, 100, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int expected = 6;
        int actual = AnalyzingWeatherData.analyzeWeather(array);
        assertEquals(expected, actual);
    }
}