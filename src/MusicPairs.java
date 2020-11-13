import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MusicPairs {
    public static int getSongPairCount(List<Integer> songs) {
        HashSet<Integer> songSet=new HashSet();
        int count=0;
        for(Integer i:songs){
            if(songSet.contains(i)){
                count++;
            }else
                songSet.add(60-i);
        }
      return count;
    }

    public static void main(String[] args) {
        Integer []arr={10, 50, 90, 30};
        List<Integer>list= (List<Integer>) Arrays.asList(arr);
        System.out.println(getSongPairCount(list));

    }
}
