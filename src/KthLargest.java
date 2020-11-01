import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {
       KthLargest kthLargest=new KthLargest();
        System.out.println(kthLargest.findKthLargest(new int[]{3,2,1,5,6,4},2));
    }

    public int findKthLargest(int[] nums, int k) {
        int max=0;
        PriorityQueue<Integer>queue=new PriorityQueue();
        for(int i=0;i<nums.length;i++){
            queue.add(nums[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.poll();
    }
}
