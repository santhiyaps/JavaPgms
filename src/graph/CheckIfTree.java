package graph;

import java.util.*;

public class CheckIfTree {
    /*UnDirected graph*/
    public boolean validTree(int n, int[][] edges) {
        if(edges.length!=n-1) return false;
        List<List<Integer>>adjList=new ArrayList();
        Set<Integer>visited=new HashSet();
        Queue<Integer>queue=new Queue<>(n);
        int count=0;
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        queue.enqueue(0);
        visited.add(0);
        while(!queue.isEmpty()){
            int num=queue.dequeue();
            for(int next:adjList.get(num)){
                if(visited.contains(next)) continue;
                visited.add(next);
                queue.enqueue(next);
            }
        }
        return visited.size()==n;
    }
}
