import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfArraysTest {

    @Test
    public void averageOfArrays() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {1, 48, 12, 22, 55, 4, 5}
        };
        int expected = 3;
        int actual = ArrayOfArrays.averageOfArrays(weeklyMonthTemperatures);
        assertEquals(expected, actual);
    }
}