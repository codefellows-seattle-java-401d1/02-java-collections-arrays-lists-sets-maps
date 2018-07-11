import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class duplicateCheckerTest {

    @Test
    void duplicateChecker() {
        int[] input = {1,2,3,4,5};
        assertFalse(duplicateChecker.duplicateChecker(input));
    }

    @Test
    void duplicateChecker1() {
        int[] input = {1,1,3,4,5};
        assertTrue(duplicateChecker.duplicateChecker(input));
    }

    @Test
    void duplicateChecker2() {
        int[] input = {};
        assertTrue(duplicateChecker.duplicateChecker(input));
    }
}