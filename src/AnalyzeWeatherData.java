public class AnalyzeWeatherData {
    public static void main(String[] args) {

        int[][] temps = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

    }

    public static int main(int[] arr) {

        int largest = temps[0][0];
        int smallest = temps[0][0];

        for (int i = 1; i < temps.length; i++) {
            if (temps[0][i] > largest) {
                largest = temps[0][i];
            }
        }

        System.out.println(largest);
        return largest;


    }
}