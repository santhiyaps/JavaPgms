import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i=0,j=0,count=0;;
        while(i<sequence.size() && j<array.size()){
            if(sequence.get(i)==array.get(j)){
                i++;
            }
            j++;
        }
        return (i == sequence.size());
    }
}
