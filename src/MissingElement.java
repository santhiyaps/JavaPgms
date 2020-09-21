public class MissingElement {
    public int missingElement(int[] nums, int k) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            
        }
        if(k>1){
            return nums[nums.length-1]+k;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MissingElement().missingElement(new int[]{4,7,9,10},1));
    }
}
