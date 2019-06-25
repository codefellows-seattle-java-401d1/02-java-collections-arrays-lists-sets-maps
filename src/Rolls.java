import java.lang.reflect.Array;
import java.math.*;

public class Rolls {
    public static void main(String[] args) {

        }

    public static int[] roll(int n) {

        int[] result = new int[n];

        int random = (int) ((Math.random() * 6) + 1);

        for(int i = 0; i < n; i++) {
            result[i] = random;
        }

        return result;
    }
}
