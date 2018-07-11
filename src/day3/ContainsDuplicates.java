package day3;

public class ContainsDuplicates {


    public static boolean containsDuplicates(int[] arr) {

        boolean isDuplicate = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {

                    isDuplicate = true;

                }

            }

        }

        System.out.println(isDuplicate);

        return isDuplicate;
    }
}