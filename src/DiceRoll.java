import java.util.Arrays;
import java.util.Set;

public class DiceRoll {
    public static void main(String[] args) {

        int[] rr = roll(6);
        System.out.println(Arrays.toString(rr));
    }


    public static int[] roll(int n) {
        int[] rollArray = new int[n];
        int i = 0;

        while (i < rollArray.length) {
            int dieRoll = (int) Math.ceil(6 * Math.random());
            rollArray[i] = dieRoll;
            i++;
        }
        return rollArray;
    }
}
