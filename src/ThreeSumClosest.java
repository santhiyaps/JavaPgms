import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int prevdiff=Integer.MAX_VALUE;
        int closest=0;
        if(nums.length==3){
            prevdiff=nums[0]+nums[1]+nums[2];
        }else{
            for(int i=0;i<nums.length-2;i++){
                int left=i+1;
                int right=nums.length-1;
                while(left<right){
                    int currSum=nums[left]+nums[i]+nums[right];
                    if(currSum==target){
                        prevdiff=target;
                        return target;
                    }
                    else if(currSum<target){
                        left++;
                        if(prevdiff>target-currSum) {
                            prevdiff = Math.min(prevdiff, target - currSum);
                            closest=currSum;
                        }
                    }else if(currSum>target){
                        right--;
                        if(prevdiff>currSum-target) {
                            prevdiff = Math.min(prevdiff, currSum - target);
                            closest=currSum;
                        }

                    }
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}
