package graph;

import java.util.*;

public class CouseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>>courseMap=new HashMap();
        int indegrees[]=new int[numCourses];
        Queue<Integer> queue= new Queue<Integer>(numCourses);
        int count=0;
        for(int n[]:prerequisites){
            List<Integer> list=courseMap.getOrDefault(n[0],new ArrayList<Integer>());
            list.add(n[1]);
            indegrees[n[1]]++;
            courseMap.put(n[0],list);
        }
        for(int i=0;i<indegrees.length;i++){
            if(indegrees[i]==0)
                queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            int course=queue.dequeue();
            count++;
            List<Integer>list=courseMap.get(course);
            if(list!=null){
                for(int n:list){
                    indegrees[n]--;
                    if(indegrees[n]==0)
                        queue.enqueue(n);
                }
            }
        }
        return count==numCourses;
    }
}
