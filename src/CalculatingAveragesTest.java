import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingAveragesTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        double average = CalculatingAverages.calculateAverage(arr);

        assertEquals(0, average);
    }

    @Test
    void containsDuplicates() {
        int[] arr = {10, 10, 10, 10, 100};
        double average = CalculatingAverages.calculateAverage(arr);

        assertEquals(average, average);
    }

}