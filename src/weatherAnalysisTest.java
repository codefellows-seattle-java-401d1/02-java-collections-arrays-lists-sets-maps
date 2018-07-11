import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class weatherAnalysisTest {

    @Test
    void analyzer() {
        int[] input = {-1,-3};
        assertTrue(weatherAnalysis.analyzer(input).equals("Max: -1\nMin: -3\nNever saw: -2"));
    }
    @Test
    void analyzer1() {
        int[] input = {};
        assertTrue(weatherAnalysis.analyzer(input).equals("Max: -500\nMin: 500"));
    }
    @Test
    void analyzer2() {
        int[] input = {1,3};
        assertTrue(weatherAnalysis.analyzer(input).equals("Max: 3\nMin: 1\nNever saw: 2"));
    }
}