public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        containsDuplicates(arr);
    }

    public static boolean containsDuplicates(int[] arr) {
        boolean isDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println("arr[i]: " + arr[i]);
                    System.out.println("arr[j]: " + arr[j]);
                    System.out.println("i: " + i);
                    System.out.println("j: " + j);
                    isDuplicate = true;
                }
            }
        }
        System.out.println(isDuplicate);
        return isDuplicate;
    }
}