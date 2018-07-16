import java.util.HashSet;
import java.util.Set;

public class AnalyzingWeatherData {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        Object answer = analyzeWeather(weeklyMonthTemperatures);
        System.out.println("done");
    }

    public static int analyzeWeather(int[][] weeklyMonthTemperatures) {
        int maxHigh = 0;
        Set<Integer> seen = new HashSet<>();
        int maxLow = 100;
        int temp = 0;
        for (int row = 0; row < weeklyMonthTemperatures.length; row++) {

            for (int col = 0; col < weeklyMonthTemperatures[row].length; col++) {
                temp = temp + weeklyMonthTemperatures[row][col];
                if (temp > maxHigh) {
                    maxHigh = temp;

                }
                if (temp < maxLow) {
                    maxLow = temp;
                }
                seen.add(temp);
                temp = 0;
            }
        }
        System.out.println("High " + maxHigh);
        System.out.println("Low " + maxLow);
        for (int i = maxLow; i < maxHigh; i++) {
            int seenCheck = i;
            if (!seen.contains(seenCheck)) {
                System.out.println(i);
            }
        }

        return maxHigh;
    }
}
