public class Roll {
    public static void main(String[] args) {
        int[] results=roller(Integer.parseInt(args[0]));
        for(int m = 0; m < results.length; m++){
            System.out.print(results[m]);
        }
    }

    public static int[] roller(int howMany){
        int[] results = new int [howMany];
        for(int m = 0; m<howMany; m++){
            results[m] = (int) Math.ceil(6*Math.random());
        }
        return results;
    }
}
