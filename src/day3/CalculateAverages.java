package day3;

public class CalculateAverages {
    public static void main(String[] args) {
        int[] arr = {42, 15, 3, 6, 9, 14, 77, 8, 10, 2};
        calculateAverage(arr);
    }

    public static void calculateAverage(int[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += (double) arr[i]/arr.length;
        }
        System.out.println(total);
    }
}