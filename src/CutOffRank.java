import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CutOffRank {
    public static int cutOffRank(int cutOffRank, int num, List<Integer> scores) {
        Collections.sort(scores, Collections.reverseOrder());
        int i=0,rank=0,position=0;
        while(i<num){
            position++;
            if(i==0 || scores.get(i-1)!=scores.get(i)){
                rank++;
                if(rank>cutOffRank || position>cutOffRank){
                    break;
                }
            }
            i++;
        }
        return i;


    }
    public  static int cutOffRank(int cutOffRank, int num, int[] scores) {
        Arrays.sort(scores);
        int i=0,rank=0,position=0,j=scores.length-1;
        while(j>=0){
            position++;
            if(j==scores.length-1 || (scores[j+1]!=scores[j])){
                rank++;
                if(rank>cutOffRank || position>cutOffRank){
                    break;
                }
            }
            j--;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {

       System.out.println(cutOffRank(3, 4, Arrays.asList(100,50,50,25)));
        System.out.println(cutOffRank(4, 5, Arrays.asList(2,2,3,4,5)));
        System.out.println(cutOffRank(4, 5, new int[]{2,2,3,4,5}));
        System.out.println(cutOffRank(4, 5, new int[]{100,50,50,25}));
    }
}
