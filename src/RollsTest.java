import static org.junit.jupiter.api.Assertions.*;

class RollsTest {

    @org.junit.jupiter.api.Test
    void roll() {
            int n = 5;
            int[] result = Rolls.roll(n);

            assertEquals(result.length,n);
    }
}