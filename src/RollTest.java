import static org.junit.jupiter.api.Assertions.*;

class RollTest {

    @org.junit.jupiter.api.Test
    void roller() {
        assertEquals(5, Roll.roller(5).length);
    }

    @org.junit.jupiter.api.Test
    void roller1() {
        int[] actualArray = Roll.roller(5);
        for (int actualInt : actualArray) {
            assertFalse(actualInt < 1 || actualInt > 6);
        }
    }

    @org.junit.jupiter.api.Test
    void roller2() {
        int[] actualArray = Roll.roller(300);
        for (int actualInt : actualArray) {
            assertFalse(actualInt == 0);
        }
    }
}