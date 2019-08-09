import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public static int duplicates(int[] array) {
        int duplicate=0;
        Map<Integer,Integer>duplicateArray=new HashMap<>();
        if (array.length > 0) {
            for (int i : array) {
                if (duplicateArray.containsKey(i))
                {
                    duplicate++;
                    duplicateArray.remove(i);


                }else
                {
                    duplicateArray.put(i,1);
                }
            }
        }
        return duplicate;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6, 5, 2};
        int numOfPairs = 2;
        System.out.println(FindPairs.duplicates(array));
    }

}
