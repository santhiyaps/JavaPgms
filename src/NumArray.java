import java.util.HashMap;

class NumArray {
    HashMap<Integer,Integer> sumMap;
    public NumArray(int[] nums) {
        sumMap=new HashMap();
        if(nums.length>=1)
            sumMap.put(0,nums[0]);
        for(int i=1;i<nums.length;i++){
            sumMap.put(i,nums[i]+sumMap.get(i-1));
        }
    }

    public int sumRange(int i, int j) {
        if(i==0)
            return sumMap.get(j);
        else if(i==0 && j==0)
            return sumMap.get(i);
        else{
            return sumMap.get(j)-sumMap.get(i-1);
        }
    }

    public static void main(String[] args) {
        NumArray nums=new NumArray(new int[]{-2,0,3,-5,2,-1});
        System.out.println(nums.sumRange(0,2));
        /*["NumArray","sumRange","sumRange","sumRange"]
[[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]*/
    }
}