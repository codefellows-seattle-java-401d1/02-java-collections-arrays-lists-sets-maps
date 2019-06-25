public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] aa) {
        int[] dup = new int[aa.length];

        for (int i = 0; i < aa.length; i++) {
            for (int j = i + 1; j < aa.length; j++) {
                if (aa[i] == dup[j])
                return true;


            }
        }
        return false;

    }



}



