package graph;

import java.util.*;

public class CourseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>>courseMap=new HashMap();
        int indegrees[]=new int[numCourses];
        int[]topological=new int[numCourses];
        Queue<Integer>queue=new Queue<>(numCourses);
        int count=0;
        for(int n[]:prerequisites){
            List<Integer> list=courseMap.getOrDefault(n[1],new ArrayList<Integer>());
            list.add(n[0]);
            indegrees[n[0]]++;
            courseMap.put(n[1],list);
        }
        for(int i=0;i<indegrees.length;i++){
            if(indegrees[i]==0)
                queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            int course=queue.dequeue();
            topological[count++]=course;;
            List<Integer>list=courseMap.get(course);
            if(list!=null){
                for(int n:list){
                    indegrees[n]--;
                    if(indegrees[n]==0)
                        queue.enqueue(n);
                }
            }
        }
        if(count==numCourses)
            return topological;
        return new int[0];
    }

}
