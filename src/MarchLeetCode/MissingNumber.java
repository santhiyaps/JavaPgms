package MarchLeetCode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int sum=(len * (len+1))/2;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
        }
        return sum-currSum;
    }
}
