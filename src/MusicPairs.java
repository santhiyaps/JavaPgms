import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MusicPairs {
    public static int getSongPairCount(List<Integer> songs) {
        int result[]=new int[60];
        int count=0;
        for(int i:songs){
            if(i%60==0)
                count+=result[0];
            else
                count+=result[60-i%60];
            result[i%60]++;

        }
        return count;
    }

    public static void main(String[] args) {
        Integer []arr={10, 50, 90, 30};
        List<Integer>list= (List<Integer>) Arrays.asList(arr);
        System.out.println(getSongPairCount(list));

    }
}
