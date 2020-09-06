public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int contains=0;
        int n=nums.length;
        for(int i:nums){
            if(i==1)
                contains++;
        }
        if(contains==0) return 1;
        if(n==1) return 2;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n)
                nums[i]=1;
        }

        for(int i=0;i<n;i++){
            int index=Math.abs(nums[i]);
            if (index == n)
                nums[0] = - Math.abs(nums[0]);
            else
                nums[index] = - Math.abs(nums[index]);
        }
        for(int i=1;i<n;i++){
            if(nums[i]>0)
                return i;
        }
        if(nums[0]>0)
            return n;

        return n+1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstMissingPositive().firstMissingPositive(new int[]{2,1}));
    }
}
