import static org.junit.jupiter.api.Assertions.*;

class DiceRollTest {

    @org.junit.jupiter.api.Test
    public void roll() {
        int num = 16;
        int expected = num;
        int[] actual = DiceRoll.roll(num);
        assertEquals(expected, actual.length);

    }
}