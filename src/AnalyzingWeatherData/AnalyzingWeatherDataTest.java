package AnalyzingWeatherData;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzingWeatherDataTest {

    @Test
    void weatherDataActual() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        };

        List actual = AnalyzingWeatherData.weatherData(weeklyMonthTemperatures);

        List <Integer> expected = new ArrayList<>();
        expected.add(63);
        expected.add(67);
        expected.add(68);
        expected.add(69);

        assertEquals(expected, actual);
    }

    @Test
    void weatherDataJagged() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 57, 60},
                {57, 65, 65, 70},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 55, 52, 55, 62},
        };

        List actual = AnalyzingWeatherData.weatherData(weeklyMonthTemperatures);

        List <Integer> expected = new ArrayList<>();
        expected.add(56);
        expected.add(63);
        expected.add(67);
        expected.add(68);
        expected.add(69);

        assertEquals(expected, actual);
    }

    //Could not include an empty array text since the expected is an error
    //and I could not find a way to show an error was expected when the test was run.
}