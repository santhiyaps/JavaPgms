public class HouseRobber {

    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int dp[] = new int[nums.length + 1];
        if(nums.length>1) {
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for(int i=2;i<nums.length;i++){
                dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            }
        }
        return dp[nums.length-1];

    }
    public int rob1(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        nums[1]=Math.max(nums[0],nums[1]);
        int temp=0;
        for(int i=2;i<nums.length;i++) {
            temp=nums[i];
            nums[i]=Math.max(nums[i]+nums[i-2],nums[i-1]);
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        HouseRobber houseRobber=new HouseRobber();
        System.out.println(houseRobber.rob1(new int[]{1,2,3,1}));
    }
}
