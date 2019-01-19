import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class AnalyzingWeatherData {

    public static List data(int[][] array) {

        HashSet<Integer> data = new HashSet<>();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                data.add(array[row][col]);
            }
        }
        int max = Collections.max(data, null);
        int min = Collections.min(data, null);

        List<Integer> neverSeen = new ArrayList<>();

        System.out.println("High: " + max);
        System.out.println(" Low: " + min);
        for (int i = min; i < max; i++) {
            if (!data.contains(i)) {
                int j = 0;
                neverSeen.add(i);
                System.out.println("Never saw temperature: " + neverSeen.get(j));
                j++;
            }
        }

        return neverSeen;
    }
}


