public class AnalyzeWeatherData {
    public static void main(String[] args) {
        double[] temps = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57};

        double smallest = temps[0];
        double largest = temps[0];
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < smallest) {
                smallest = temps[i];
        for (int j = 0; i < temps.length; i++) {
            if (temps[j] > largest)
            largest = temps[j];

        }
            }
        } System.out.println(smallest);
        }
    }
}

// Expected Output
// High: 72
// Low: 51
//Never saw temperature: 63
//Never saw temperature: 67
//Never saw temperature: 68
//Never saw temperature: 69