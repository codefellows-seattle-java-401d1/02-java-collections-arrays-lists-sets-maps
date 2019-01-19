import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {



        @org.junit.jupiter.api.Test
        void containsDuplicate() {
            int[] arr1 = {1,2,3,4,4};
            int[] expected = {1,2,3,4,4};

            assertArrayEquals(expected, arr1);
    }

}