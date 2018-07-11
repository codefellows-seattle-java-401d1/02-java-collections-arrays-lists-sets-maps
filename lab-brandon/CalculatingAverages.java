public class CalculatingAverages {

    public static double calculatingAverages (int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return (double) total / arr.length;
    }
}
