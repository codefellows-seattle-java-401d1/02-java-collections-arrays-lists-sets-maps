import java.util.Arrays;

public class RollingDice {

    public static int[] roll (int n) {
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            int rawling = (int) Math.ceil(6 * Math.random());
            arr[i] = rawling;
        }
        return arr;
    }
}
