import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfArraysTest {

    @Test
    void averagesOfTemperatureTest() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        };
        int[] actual = ArrayOfArrays.arrayOfArrays(weeklyMonthTemperatures);
        int[] expected = {55,54,60,53,59,57,61};

        assertArrayEquals(expected, actual);
    }
}






