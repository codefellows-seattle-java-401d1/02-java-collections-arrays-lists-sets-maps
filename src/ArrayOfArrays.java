public class ArrayOfArrays {
    public static int[] arrayOfArrays(int[][] aa) {

        double[] temp = new double[aa.length];

        for (int row = 0; row < aa.length; row++) {
            int rowTotal = 0;
            double rowAverage = 0;

            for (int col = 0; col < aa[row].length; col++) {
                rowTotal += aa[row][col];
                rowAverage = (double) rowTotal / aa[row].length;
            }
            temp[row] += rowAverage;
        }

        double minValue = temp[0];
        int minIndex = 0;

        for (int i = 1; i < temp.length; i++) {

            if (temp[i] < minValue) {
                minValue = temp[i];
            }

            if (temp[i] == minValue) {
                minIndex = i;
            }
        }
        return aa[minIndex];

    }
}
