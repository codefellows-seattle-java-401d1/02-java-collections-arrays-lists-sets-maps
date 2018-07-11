package ArraysOfArrays;

import java.util.Arrays;

public class ArraysOfArrays {
    public static void main(String[] args) {
        int[][] arraySet = {
                {1, 2, 3},
                {2, 2, 6, 7, 9},
                {0, 1,  99},
                {1, 1, 1},
                {0,0,15},
        };

        averagesOfArray(importingArray(arraySet));

    }

    public static int[][] importingArray(int[][] groupOfArrays) {
        int[][] superHelpArray = new int[groupOfArrays.length][0];

        for (int i = 0; i < groupOfArrays.length; i++) {
            int[] row = groupOfArrays[i];
            superHelpArray[i] = row;
        }
            return superHelpArray;
        }


    public static int[] averagesOfArray(int[][] arrayGroup) {

        double average = 0;
        double calculations = 0;
        int[] answer = {0};
        double previousAverage = 0;
        double holdingAverage = 0;


        for (int row = 0; row < arrayGroup.length; row++) {
            for (int col = 0; col < arrayGroup[row].length; col++) {
                arrayGroup[row][col] = arrayGroup[row][col];
            }
        }

        for (int row = 0; row < arrayGroup.length; row++) {
            for (int col = 0; col < arrayGroup[row].length; col++) {
                    calculations = arrayGroup[row][col] + calculations;

                if (col == arrayGroup[row].length - 1) {
                    average = calculations/arrayGroup[row].length;
                    System.out.println("The average of array " + Arrays.toString(arrayGroup[row]) + " is " + average);

                        if (average < previousAverage) {
                            holdingAverage = average;
                            answer = arrayGroup[row];
                            System.out.println("current held average is " + holdingAverage + " for " + Arrays.toString(arrayGroup[row]));
                        }
                    previousAverage = average;
                    }
            }
            calculations = 0;
        }
        System.out.println("The returned value is " + Arrays.toString(answer));
            return answer;
    }
}
