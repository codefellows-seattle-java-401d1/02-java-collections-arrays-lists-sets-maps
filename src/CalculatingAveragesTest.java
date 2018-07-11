import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingAveragesTest {

    @Test
    public void averageArray() {
        int[] array = {2, 4, 6, 8, 10, 12};
        int expected = 7;
        int actual = CalculatingAverages.averageArray(array);
        assertEquals(expected, actual);
    }
}