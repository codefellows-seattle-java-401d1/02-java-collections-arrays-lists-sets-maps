package RollingDice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RollingDiceTest {

    @Test
    void howManyRolled() {
        int diceRolls = 10;
        int[] howmany = RollingDice.roll(diceRolls);
        int expected = diceRolls;
        assertEquals(expected, howmany.length);
    }

    @Test
    void rollingZeroDice() {
        int diceRolls = 0;
        int[] howmany = RollingDice.roll(diceRolls);
        int expected = diceRolls;
        assertEquals(expected, howmany.length);
    }
}