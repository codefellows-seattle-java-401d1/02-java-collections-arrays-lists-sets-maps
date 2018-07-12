public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        containsDuplicates(arr);
    }

    public static boolean containsDuplicates(int[] arr) {
        boolean isDuplicate = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row] == arr[col] && row != col) {
                    System.out.println("arr[row]: " + arr[row]);
                    System.out.println("arr[col]: " + arr[col]);
                    System.out.println("row: " + row);
                    System.out.println("col: " + col);
                    isDuplicate = true;
                }
            }
        }
        System.out.println(isDuplicate);
        return isDuplicate;
    }
}