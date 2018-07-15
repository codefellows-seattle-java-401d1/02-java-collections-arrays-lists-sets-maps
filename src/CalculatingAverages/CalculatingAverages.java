package CalculatingAverages;

import static java.lang.Double.NaN;

public class CalculatingAverages {
    public static void main(String[] args) {
        int[] practiceArray = {1, 2, 3};
        calculatingArrayAverages(practiceArray);
    }
    public static double calculatingArrayAverages (int[] numbersArray) {
        int[] numbers = new int[numbersArray.length];
        double average = 0;

        if ((numbers.length == 0)) {
            return NaN;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbersArray[i];
                average = numbers[i] + average;
            }
        }
        System.out.println(average/numbers.length);
        return average/numbers.length;
    }
}
