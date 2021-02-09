package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class AllPathsFromSource {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>paths=new ArrayList();
        LinkedList<List<Integer>> queue=new LinkedList<List<Integer>>();
        int target=graph.length-1;
        queue.add(Arrays.asList(0));
        while(!queue.isEmpty()){
            List<Integer>path=queue.poll();
            int curr=path.get(path.size()-1);
            if(curr==target){
                paths.add(new ArrayList<>(path));
            } else{
                int arr[]=graph[curr];
                for(int i:arr){
                    List<Integer>list=new ArrayList(path);
                    list.add(i);
                    queue.add(list);
                }
            }
        }
        return paths;
    }
}
