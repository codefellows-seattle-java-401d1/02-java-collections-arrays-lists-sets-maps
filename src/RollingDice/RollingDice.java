package RollingDice;

import java.util.Arrays;

public class RollingDice {
    public static void main(String[] args) {
        roll(20);
    }
    public static int[] roll (int n) {
        int[] dice = new int[n];
        for (int i = 0; i < n; i++) {
            dice[i] = (int)Math.ceil((Math.random() * (7-1)));
        }

        System.out.println(Arrays.toString(dice));

        return dice;
    }
}
