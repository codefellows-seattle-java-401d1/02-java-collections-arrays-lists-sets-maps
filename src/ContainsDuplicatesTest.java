import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    @Test
    void emptyArray() {
        int[] arr = {};
        boolean isDuplicate = ContainsDuplicates.containsDuplicates(arr);

        assertEquals(false, isDuplicate);
    }

    @Test
    void containsDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 8, 9, 10};
        boolean isDuplicate = ContainsDuplicates.containsDuplicates(arr);

        assertEquals(true, isDuplicate);
    }

    @Test
    void noDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isDuplicate = ContainsDuplicates.containsDuplicates(arr);

        assertEquals(false, isDuplicate);
    }
}