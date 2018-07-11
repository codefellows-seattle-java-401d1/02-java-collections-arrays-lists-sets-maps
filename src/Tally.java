import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tally {
    public static void main(String[] args) {
        List<String> listOfVotes = new ArrayList<>();
        for (String currentString : args){
            listOfVotes.add(currentString);
        }
        System.out.println(tally(listOfVotes));
    }

    public static String tally(List<String> input){
        HashMap<String, Integer> tallyMap = new HashMap<>();
        int maxVotes = 0;
        String returnedCandidate = "ERR: no votes?";
        for(String currentString : input){
            if(!tallyMap.containsKey(currentString)){
                tallyMap.put(currentString, 1);
            }else{
                tallyMap.put(currentString, tallyMap.get(currentString) + 1);
            }
            if(tallyMap.get(currentString)==maxVotes){
                returnedCandidate="Run off between "+returnedCandidate+" and "+currentString;
            }
            if(tallyMap.get(currentString)>maxVotes){
                returnedCandidate=currentString;
                maxVotes++;
            }
        }
        return returnedCandidate;
    }
}
