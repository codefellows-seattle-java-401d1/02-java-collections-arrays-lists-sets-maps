package ContainsDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    @Test
    void containsDuplicatesTrue() {
        int[] testArray = {1, 1, 2, 3, 7, 10};
        Boolean actual = ContainsDuplicates.containsDuplicates(testArray);

        Boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void containsDuplicatesFalse() {
        int[] testArray = {99, 9, 3, 67, 14};
        Boolean actual = ContainsDuplicates.containsDuplicates(testArray);

        Boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void containsEmptyArray() {
        int[] testArray = {};
        Boolean actual = ContainsDuplicates.containsDuplicates(testArray);

        Boolean expected = false;

        assertEquals(expected, actual);
    }
}