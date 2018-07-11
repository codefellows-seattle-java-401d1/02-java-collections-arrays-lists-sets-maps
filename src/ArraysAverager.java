public class ArraysAverager extends Averager{
    public static void main(String[] args){
        int[] array = {5,7,9,8,4};
        int[] array1 = {7,3,6,41,789,5,1,5,6,4};
        int[][] inputArray= {array, array1};
        double[] result = arraysAverager(inputArray);
        for(double numberout : result){
            System.out.println(numberout);
        }
    }
    public static double[] arraysAverager(int[][] args){
        double[] output = new double[args.length];
        int currentindex = 0;
        for(int[] currentArray : args) {
            output[currentindex] = Averager.averager(currentArray);
            currentindex++;
        }
        return output;
    }

}
