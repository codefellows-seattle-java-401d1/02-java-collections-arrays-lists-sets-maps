import java.util.Arrays;

public class ArrayOfArrays {

    public static void main(String[] args) {

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(findAvg(weeklyMonthTemperatures)));
    }

    // Given an array of arrays calculate the average value for each array
    // and return the array with the lowest average.

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
        }

        double lowestVal = tempArray[0];
        int lowestIndex = 0;

        for (int i = 1; i < tempArray.length; i++) {

            if (tempArray[i] < lowestVal) {
                lowestVal = tempArray[i];
            }

            if (tempArray[i] == lowestVal) {
                lowestIndex = i;
            }
        }

        return aa[lowestIndex];
    }
}