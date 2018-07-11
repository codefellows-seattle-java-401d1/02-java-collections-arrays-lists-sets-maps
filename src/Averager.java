public class Averager extends Roll{
    public static void main(String[] args){
        int[] integers = new int[args.length];
        integers = intergerify(args);
        System.out.println(averager(integers));
        System.out.println(averager(roller(5)));
    }

    public static int[] intergerify(String[] input){
        int[] integers = new int[input.length];
        for(int i = 0; i < input.length; i++){
            integers[i] = Integer.parseInt(input[i]);
        }
        return integers;
    }

    public static double averager(int[] array){
        int total = 0;
        for (int currentValue : array){
            total = total + currentValue;
        }
        double average = (double) total;

        return(average/array.length);
    }
}
