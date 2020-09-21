import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for(int currentNum : nums) {
            //get the current number of subsets
            int n = subsets.size();
            for(int i = 0; i < n; i++) {
                // create a new subset from each existing subset (copying over existing results)
                List<Integer> currentList = new ArrayList<>(subsets.get(i));
                currentList.add(currentNum); //adding currentNum to existing subsets
                subsets.add(currentList);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {
        List<List<Integer>>subSets=new Subsets().subsets(new int[]{ 1,2,3});

    }
}
