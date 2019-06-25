import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageTest {

    @Test
    void arrayAverageTest() {

        int[] arr = {1,2,3,4,5};
        double expected = 3.0;

        double actual = ArrayAverage.arrayAverage(arr);
        assertEquals(expected,actual);


    }
}