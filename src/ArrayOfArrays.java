public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int maxVal = averageOfArrays(weeklyMonthTemperatures);
        System.out.println(maxVal);
    }
    public static int averageOfArrays(int[][] weeklyMonthTemperatures) {
        int averageHolder = 0;
        int maxVal = 0;
        for (int row = 0; row < weeklyMonthTemperatures.length; row++) {
            averageHolder = 0;
            for (int col = 0; col < weeklyMonthTemperatures[row].length; col++) {
                averageHolder = averageHolder + weeklyMonthTemperatures[row][col];
            }


        }
        averageHolder = averageHolder / weeklyMonthTemperatures.length;
        if(averageHolder > maxVal) {
            maxVal = averageHolder;
        }
        return maxVal;
    }
}
