package day3;

import org.junit.jupiter.api.Test;
import day3.RollingDice;

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
    void sevenRoll() {
        int n = 7;
        int[] result = RollingDice.roll(n);
        int expected = n;
        assertEquals(expected, result.length);
        System.out.println("seven roll test " + Arrays.toString(result));
    }

    @Test
    void threeRoll() {
        int n = 3;
        int[] result = RollingDice.roll(n);
        int expected = n;
        assertEquals(expected, result.length);
        System.out.println("three roll test " + Arrays.toString(result));
    }

}
