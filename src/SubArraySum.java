public class SubArraySum {

    public int subarraySum(int[] nums, int k) {
        int start=0,end=0;
        int sum=0;
        int count=0;
        while(end<nums.length){
            sum+=nums[end];
            if(nums[end]==k){
                count++;
                sum-=nums[start];
                start++;
                end++;
            }
            else if(sum==k){
                count++;
                sum-=nums[start];
                start++;
            }else if(sum>k){
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new SubArraySum().subarraySum(new int[]{-1,-1,1},0));
    }
}
