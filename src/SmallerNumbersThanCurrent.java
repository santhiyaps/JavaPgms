public class SmallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int numArr[]=new int [101];
        for(int i:nums){
            numArr[i]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
          int temp=numArr[i];
          numArr[i]=sum;
          sum+=temp;
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=numArr[nums[j]];
        }
        return nums;

    }

    public static void main(String[] args) {
        int arr[]=smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        for(int k:arr){
            System.out.print(k+" , ");
        }
    }
}
