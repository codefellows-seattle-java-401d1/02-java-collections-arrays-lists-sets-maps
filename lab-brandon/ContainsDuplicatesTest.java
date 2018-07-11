import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    @Test
    void emptyTest() {
        int[] arr = {};
        boolean result = ContainsDuplicates.containsDuplicates(arr);
        boolean expected = false;
        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void nonDuplicateTest() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean result = ContainsDuplicates.containsDuplicates(arr);
        boolean expected = false;
        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void duplicateTest() {
        int[] arr = {1, 2, 3, 3, 4, 5};
        boolean result = ContainsDuplicates.containsDuplicates(arr);
        boolean expected = true;
        assertEquals(expected, result);
        System.out.println(result);
    }
}