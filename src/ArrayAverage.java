public class ArrayAverage {
    public static double arrayAverage(int[] arr){
        double total = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            total+= arr[i];
        }
        double average = total/arr.length;
        return average;
    }
}
