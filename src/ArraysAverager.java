public class ArraysAverager extends Averager{
    public static void main(String[] args){
        int[] array = {5,7,9,8,4};
        int[] array1 = {7,3,6,41,789,5,1,5,6,4};
        int[][] inputArray= {array, array1};
        int[] result = arraysAverager(inputArray);
//        for(double numberout : result){
//            System.out.println(numberout);
//        }
        System.out.println(result);
    }
    public static int[] arraysAverager(int[][] args){
//        double[] output = new double[args.length];
        int currentIndex = 0;
        int returnIndex = 0;
        double currentMax = 0-Double.POSITIVE_INFINITY;
        for(int[] currentArray : args) {
            double currentVal = Averager.averager(currentArray);
            if(currentVal>currentMax){
                currentMax=currentVal;
                returnIndex = currentIndex;
            }
//            output[currentIndex] = currentVal;
            currentIndex++;
        }
//        return output;
        return args[returnIndex];
    }

}
