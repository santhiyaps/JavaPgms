import java.util.Arrays;

public class MaxSubArray {
    public static int findMaxSumSubArray(int[] arr) {
        int currSum=Integer.MIN_VALUE;
        int globalSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(currSum<0)
                currSum=arr[i];
            else
                currSum+=arr[i];
            globalSum=Math.max(globalSum,currSum);
        }
        return globalSum;
    }
    public static void main( String args[] ) {
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Array: "+ Arrays.toString(arr1));
        System.out.println("Sum: " + findMaxSumSubArray(arr1));
    }
  
}

