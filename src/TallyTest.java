import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class TallyTest {

    @Test
    void tally() {
        List<String> input = new ArrayList<>();
        input.add("stormcloak");
        input.add("imperials");
        input.add("stormcloak");
        assertTrue(Tally.tally(input).equals("stormcloak"));
    }

    @Test
    void tally1(){
        List<String> input = new ArrayList<>();
        assertTrue(Tally.tally(input).equals("ERR: no votes?"));
    }

    @Test
    void tally2(){
        List<String> input = new ArrayList<>();
        input.add("Billy");
        input.add("Van");
        assertTrue(Tally.tally(input).equals("Run off between Billy and Van"));
    }
}