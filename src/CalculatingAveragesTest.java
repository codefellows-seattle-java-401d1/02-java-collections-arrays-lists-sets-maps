import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingAveragesTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        boolean isAverage = CalculatingAverages.calculateAverage(arr);

        assertEquals(false, isAverage);
    }

    @Test
    void containsDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 8, 9, 10};
        boolean isAverage = CalculatingAverages.calculateAverage(arr);

        assertEquals(true, isAverage);
    }

    @Test
    void noDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isAverage = CalculatingAverages.calculateAverage(arr);

        assertEquals(false, isAverage);
    }
}