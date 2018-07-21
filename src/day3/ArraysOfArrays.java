package day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysOfArrays {



    public static int[] findAvg(int[][] aa) {

        double[] tempArray = new double[aa.length];

        for (int row = 0; row < aa.length; row++) {
            int totalByRow = 0;
            double averageByRow = 0;

            for (int col = 0; col < aa[row].length; col++) {
                totalByRow += aa[row][col];
                averageByRow = (double) totalByRow / aa[row].length;
            }
            tempArray[row] += averageByRow;
            System.out.println(Arrays.toString(aa[row]) + " -- Total: " + totalByRow + " -- Avg: " + averageByRow);
        }

        double lowestVal = tempArray[0];
        int lowestIndex = 0;

        for (int i = 1; i < tempArray.length; i++) {

            if (tempArray[i] < lowestVal) {
                lowestVal = tempArray[i];
            }

            if (tempArray[i] == lowestVal) {
                lowestIndex = i;
                System.out.println("Lowest index: " + lowestIndex);
            }
        }
        System.out.println("Lowest avg: " + lowestVal);
        System.out.println("Lowest avg arr: " + Arrays.toString(aa[lowestIndex]));
        return aa[lowestIndex];
    }
}