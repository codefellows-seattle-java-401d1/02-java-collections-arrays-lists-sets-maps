import java.util.HashSet;

public class duplicateChecker {
    public static void main(String[] args) {
        int[] entries = Averager.intergerify(args);
        duplicateChecker(entries);
    }

    public static boolean duplicateChecker(int[] array){
        if(array.length==0){
            return true;
        }
        HashSet<Integer> entryMap = new HashSet<>();
        for(int entry : array){
            if(entryMap.contains(entry)){
                return true;
            }
            entryMap.add(entry);
        }
        return false;
    }
}
