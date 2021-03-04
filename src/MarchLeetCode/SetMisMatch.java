package MarchLeetCode;

public class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        int missing[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if(nums[index-1]<0){
                missing[0]=index;
            }else{
                nums[index-1]*=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                missing[1]=i+1;
        }
        return missing;
    }
}
