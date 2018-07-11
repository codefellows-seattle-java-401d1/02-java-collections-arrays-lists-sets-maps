package CalculatingAverages;

public class CalculatingAverages {
    public static void main(String[] args) {
        int[] practiceArray = {1, 2, 3};  //expected = 3 which is 1+2+3 = 6/2 = 3
        calculatingArrayAverages(practiceArray);
    }
    public static double calculatingArrayAverages (int[] numbersArray) {
        int[] numbers = new int[numbersArray.length];
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbersArray[i];
            average = numbers[i] + average;
        }
        System.out.println(average/2);
        return average/2;
    }
}
