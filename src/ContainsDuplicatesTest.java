import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    @org.junit.jupiter.api.Test
    public void containsDuplicates() {
        int[] array = {1, 2, 3, 3, 5, 8};
        boolean expected = true;
        boolean actual = ContainsDuplicates.containsDuplicates(array);
        assertEquals(expected, actual);

    }
}