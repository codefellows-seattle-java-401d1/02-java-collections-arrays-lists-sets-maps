import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RollingDiceTest {

    @Test
    void emptyRoll() {
        int n = 0;
        int[] result = RollingDice.roll(n);
        int expected = n;
        assertEquals(expected, result.length);
        System.out.println("empty test " + Arrays.toString(result));
    }

    @Test
    void fourRoll() {
        int n = 4;
        int[] result = RollingDice.roll(n);
        int expected = n;
        assertEquals(expected, result.length);
        System.out.println("four roll test " + Arrays.toString(result));
    }

    @Test
    void twentyRoll() {
        int n = 20;
        int[] result = RollingDice.roll(n);
        int expected = n;
        assertEquals(expected, result.length);
        System.out.println("twenty roll test " + Arrays.toString(result));
    }

}