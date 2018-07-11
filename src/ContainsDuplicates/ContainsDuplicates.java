package ContainsDuplicates;

import java.util.Arrays;

public class ContainsDuplicates {
    public static void main(String[] args) {
//        int[] numbersArray = {1, 3, 5, 7, 1, 6, 7, 0};
        int[] numbersArray = {2, 3};


        containsDuplicates(numbersArray);
    }

    public static Boolean containsDuplicates (int[] numbers) {

        int[] array = new int[numbers.length];
        Boolean duplicates = false;

        for (int i = 0; i < numbers.length; i++) {
            array[i] = numbers[i];
        }

        for (int index = 0; index < array.length; index++) {
            for (int possibleDuplicate = index+1; possibleDuplicate < array.length; possibleDuplicate++) {

                if (array[index] == array[possibleDuplicate]) {
                    duplicates = true;
                    return duplicates;
                }
            }
        }

        System.out.println(duplicates);
        return duplicates;
    }
}
