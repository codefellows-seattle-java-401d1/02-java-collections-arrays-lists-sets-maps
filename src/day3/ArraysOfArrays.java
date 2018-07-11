package day3;

import java.util.Arrays;

public class ArraysOfArrays {


    public static void averageWeeklyTemperatures(int[][] aa) {


        for (int row = 0; row < aa.length; row++) {
            int total = 0;
            for (int col = 0; col < aa[row].length; col++) {
                int value = aa[row][col];
                total += value;
                System.out.println(Arrays.toString(aa[row]));
            }
        }
    }
}