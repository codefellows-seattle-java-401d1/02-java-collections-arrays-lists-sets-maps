package AnalyzingWeatherData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AnalyzingWeatherData {
    public static void main(String[] args) {

    }
    public static List weatherData (int[][] array) {

        //Hash Set only keeps the unique numbers so all duplicates are removed.
        HashSet<Integer> weatherData = new HashSet<>();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                weatherData.add(array[row][col]);
            }
        }

        //Built in function to find the minimum and maximum of a Collection
        int minTemp = Collections.min(weatherData,null);
        int maxTemp = Collections.max(weatherData, null);

        List<Integer> uniqueWeatherTemps = new ArrayList <> ();
        for (int i = minTemp; i < maxTemp; i++) {
            if (!weatherData.contains(i)) {
                uniqueWeatherTemps.add(i);
            }
        }
        System.out.println("Min Temp: " + minTemp);
        System.out.println("Max Temp: " + maxTemp);
        System.out.println("Never saw temperature: " + uniqueWeatherTemps);

        return uniqueWeatherTemps;
    }
}
