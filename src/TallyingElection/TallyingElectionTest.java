package TallyingElection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TallyingElectionTest {

    @Test
    void tallyOriginalDataSet() {
        String actual = TallyingElection.tally();
        String expected = "Bush";

        assertEquals(expected, actual);
    }

    //I'm not sure how to write a test for a List like this that isn't added to outside of the function.
}