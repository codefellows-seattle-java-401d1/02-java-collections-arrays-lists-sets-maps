import java.io.Console;
import java.util.*;

public class AnalyzeWeatherData {

    public static void main(String[] args) {

        Console console = System.console();
        console.printf("Nick is here");

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(findHighLow(weeklyMonthTemperatures)));
    }

    public static int[] findHighLow(int[][] aa) {

        HashSet<Integer> set = new HashSet<>();
        for (int row = 0; row < aa.length; row++) {
            for (int col = 0; col < aa[row].length; col++) {
                set.add(aa[row][col]);
            }
        }

        int low = Collections.min(set);
        int high = Collections.max(set);
        List temps = new ArrayList<Integer>();

        for (int i = low + 1; i < high - 1; i++) {
            if (set.contains(i)) {
                temps.add(i);
            }
        }

        System.out.println("High: " + high);
        System.out.println("Low: " + low);

        for (int i = 0; i < temps.size(); i++) {
            System.out.println("Never saw temperature: " + temps.get(i));
        }

        return new int[0];
    }
}
