import java.util.Arrays;

public class RollingDice {

    public static int[] roll (int n) {
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            int rollin = (int) Math.ceil(6 * Math.random());
            array[i] = rollin;
        }
        return array;
    }
}