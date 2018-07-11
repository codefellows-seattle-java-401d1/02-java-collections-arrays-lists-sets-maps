import java.util.*;

public class weatherAnalysis extends Averager{
    public static void main(String[] args) {
        int[] tempArray = intergerify(args);
        analyzer(tempArray);
    }

    public static String analyzer(int[] arg){
        HashSet<Integer> temperatures = new HashSet<>();
        HashSet<Integer> allTemps = new HashSet<>();
        int max = -500;
        int min = 500;
        for(int currentVal : arg){
            if(currentVal>max){
                max = currentVal;
            }
            if(currentVal<min){
                min = currentVal;
            }
            temperatures.add(currentVal);
        }
        for(int currentTemp = min;currentTemp<max; currentTemp++){
            allTemps.add(currentTemp);
        }

        Iterator<Integer> itr1=temperatures.iterator();

        while(itr1.hasNext()){
            int currentTemp = itr1.next();
            allTemps.remove(currentTemp);
        }

        Iterator<Integer> itr=allTemps.iterator();                  //This Iterator is separated so Java doesn't throw a fit on line 31.

        String tempsNeverSeen = "";
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        while(itr.hasNext()){
            int currentTemp = itr.next();
            tempsNeverSeen = tempsNeverSeen + "\nNever saw: " + currentTemp;
            System.out.println("Never saw:" + currentTemp);
        }

        return "Max: " + max + "\nMin: " + min + tempsNeverSeen;

    }
}
