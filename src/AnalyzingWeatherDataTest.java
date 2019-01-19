import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzingWeatherDataTest {

    @Test
    void dataTest() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        };

        List actual = AnalyzingWeatherData.data(weeklyMonthTemperatures);

        List <Integer> expected = new ArrayList<>();
        expected.add(63);
        expected.add(67);
        expected.add(68);
        expected.add(69);

        assertEquals(expected, actual);
    }
}