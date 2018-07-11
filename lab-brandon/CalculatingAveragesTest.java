import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingAveragesTest {

//    @Test
//    void emptyTest() {
//        int[] arr = {};
//        double result = CalculatingAverages.calculatingAverages(arr);
//        double expected = 0;
//        assertEquals(expected, result);
//        System.out.println(result);
//    }

    @Test
    void calculatingAveragesWhole() {
        int[] arr = {4, 6, 14, 20};
        double result = CalculatingAverages.calculatingAverages(arr);
        double expected = 11;
        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void calculatingAveragesDecimal() {
        int[] arr = {8, 9, 11};
        double result = CalculatingAverages.calculatingAverages(arr);
        double expected = 9.333333333333334;
        assertEquals(expected, result);
        System.out.println(result);
    }
}