package ArraysOfArrays;

import java.util.Arrays;

public class ArraysOfArrays {
    public static void main(String[] args) {
        int[][] arraySet = {
                {1, 2, 3},
                {2, 2, 6, 7, 9},
                {1, 1, 1},
                {0,0,15}
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
        int[] answer = {1};
        double count = 0;


        for (int row = 0; row < arrayGroup.length; row++) {
            System.out.println(Arrays.toString(arrayGroup[row]));
            for (int col = 0; col < arrayGroup[row].length; col++) {
                arrayGroup[row][col] = arrayGroup[row][col];
            }
        }

        for (int row = 0; row < arrayGroup.length; row++) {
            System.out.println(arrayGroup[row].length);
            for (int col = 0; col < arrayGroup[row].length; col++) {

                    calculations = arrayGroup[row][col] + calculations;
                    System.out.println("calculation of MainArray at " + row + " and SubArray at " + col + " equals " + calculations);
                    if (col == arrayGroup[row].length - 1) {
                    calculations = 0;
                }
            }
        }
            return answer;
    }
    
}
