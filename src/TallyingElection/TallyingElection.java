package TallyingElection;

import java.util.ArrayList;
import java.util.List;

public class TallyingElection {
    public static void main(String[] args) {

        tally();
    }

    public static String tally () {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = "";
        for (int i = 0; i < votes.size(); i++) {
            winner = votes.get(i);
        }

        System.out.println(winner + " received the most votes!");

        return winner;
    }
}
