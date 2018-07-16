import java.util.ArrayList;
import java.util.List;

public class Tally {
    public static void main(String[] args) {
        List<String> votes = new ArrayList<>();
        votes.add("Shrub");
        votes.add("Shrub");
        votes.add("Shrub");
        tally(votes);
        String result = tally(votes);
        System.out.println(result + " received the most votes!");
    }

        public static String tally (List<String> votes) {
            String winner = "";
            for (int i = 0; i < votes.size(); i++) {
                winner = votes.get(i);
            }


            return winner;
        }
}