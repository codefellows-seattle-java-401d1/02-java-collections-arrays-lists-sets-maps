public class CalculatingAverages {
    public static void main(String[] args) {
        int[] array = {100, 1000, 10000, 100, 100};
        int averageHolder = averageArray(array);
        System.out.println(averageHolder);

    }
    public static int averageArray(int[] array) {
        int averageHolder = 0;
        for (int i = 0; i < array.length; i++) {
            averageHolder = averageHolder + array[i];
        }
        averageHolder = averageHolder / array.length;
        return averageHolder;
    }
}
