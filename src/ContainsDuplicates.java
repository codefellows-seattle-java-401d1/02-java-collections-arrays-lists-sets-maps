import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 8};
        containsDuplicates(array);
        System.out.println(containsDuplicates(array));
    }

    public static boolean containsDuplicates(int[] array) {
        Set<Integer> test = new HashSet<>();
        for (int i : array) {
            if (test.contains(i))
                return true;
                test.add(i);
            }
            return false;
        }
    }
