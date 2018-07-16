import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TallyTest {

    @Test
    public void tallyTest() {
        List<String> votes = new ArrayList<>();
        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Tally");
        votes.add("Test");
        votes.add("Test");
        votes.add("Test");
        votes.add("Test");
        votes.add("Test");
        votes.add("Test");
        votes.add("Test");


        String expected = "Test";
        String actual = Tally.tally(votes);
        assertSame(expected, actual);
    }
}