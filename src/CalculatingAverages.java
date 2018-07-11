public class CalculatingAverages {
    public static void main(String[] args) {
        int[] arr = {12, 125, 3, 56, 19, 14, 47, 83, 0, 9};
        calculateAverage(arr);
    }

    public static double calculateAverage(int[] arr) {
        double average = 0;
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += (double) arr[i]/arr.length;
        }
        System.out.println(total);
        return average;
    }
}