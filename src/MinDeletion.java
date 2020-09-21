import java.util.Collections;
import java.util.PriorityQueue;

public class MinDeletion {
    int minDeletion(String s){
       int []charArr=new int[26];
       for(char c:s.toCharArray()){
           charArr[c-'a']++;
       }
        PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<charArr.length;i++){
           if(charArr[i]!=0){
               queue.add(charArr[i]);
           }
       }
       int count=0;
       while(!queue.isEmpty()){
           int mostFrequent=queue.poll();
           if(queue.size()==0)
               return count;
           if(mostFrequent==queue.peek()){
               if(mostFrequent>1){
                   queue.add(mostFrequent-1);
               }
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        System.out.println(new MinDeletion().minDeletion("example"));
    }
}
