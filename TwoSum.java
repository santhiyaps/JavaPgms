import java.util.Hashtable;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        Hashtable<Integer, Integer> numTable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                int diff = target-nums[i];
                if (numTable.containsKey(diff)) {
                    return new int[]{numTable.get(diff),i};
                }
            }
            numTable.put(nums[i],i);
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]=twoSum(new int[]{0,4,3,0}, 0);
        System.out.println("["+a[0]+","+a[1]+"]");
    }
}
