

public class TwoSum1 {

    public int[] twoSum(int[] numbers, int target) {
        int []result=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int currSum=numbers[left]+numbers[right];
            if(target==currSum){
                result[0]=left+1;
                result[1]=right+1;
                return result;
            }else if(target<currSum){
                right--;
            } else if(target>currSum){
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new TwoSum1().twoSum(new int[]{2,7,11,15},9);
    }
}
