import java.util.List;
import java.util.ArrayList;

public class TallyingElection {

    public static String voteTally (List<String> votes) {

        String winner = "";
        int i = 0;
        while (i < votes.size()) {
            winner = votes.get(i);
            i++;
        }
        System.out.println(winner + " received the most votes!");

        return winner;
    }
}

