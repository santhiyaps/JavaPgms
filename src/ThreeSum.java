import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>>sumRet=new ArrayList();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currSum=nums[i]+nums[left]+nums[right];
                if(currSum==0){
                    List<Integer>triples=new ArrayList();
                    triples.add(nums[i]);
                    triples.add(nums[left]);
                    triples.add(nums[right]);
                    if(!set.contains(triples)){
                        sumRet.add(triples);
                        set.add(triples);
                    }
                    left++;
                    right--;
                }else  if(currSum<0){
                    left++;
                }else if(currSum>0){
                    right--;
                }
            }
        }
        return sumRet;
    }
}
