import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class AveragerTest {

    @Test
    void intergerify() {
         String[] input = {"4","5","6","7"};
         int[] expected = {4,5,6,7};
         assertArrayEquals(expected,Averager.intergerify(input));
    }

    @Test
    void averager() {
        int[] input = {4,5,7,4};
        double expected = 5;
        assertEquals(expected,Averager.averager(input));
    }

    @Test
    void intergerify1() {
        String[] input = {};
        assertEquals(Averager.intergerify(input).length,0);
    }

    @Test
    void averager1() {
        int[] input = {5,3,1,1};
        double expected = 2.5;
        assertEquals(expected, Averager.averager(input));
    }

    @Test
    void intergerify2() {
        String[] input= {"6"};
        int [] expected = {6};
        assertArrayEquals(expected,Averager.intergerify(input));
    }

    @Test
    void averager2() {
        int[] input = {};
        assertEquals(Averager.averager(input), NaN);
    }
}