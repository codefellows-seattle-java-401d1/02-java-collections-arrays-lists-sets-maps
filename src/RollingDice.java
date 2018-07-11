import java.util.Arrays;

public class RollingDice {
    public static void main(String[] args) {
        roll(15);
    }

    public static int[] roll(int n) {

        int[] rollArray = new int [n];

        for (int i = 0; i < rollArray.length; i++) {
            int rolls = (int) Math.ceil(6 * Math.random());
            rollArray[i] = rolls;
        }
        System.out.println(Arrays.toString(rollArray));
        return rollArray;
    }
}