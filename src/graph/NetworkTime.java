package graph;

import java.util.*;

public class NetworkTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adjMap=new HashMap<>();
        Map<Integer,Integer>distMap=new HashMap();
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((a1, a2)->a1[1]-a2[1]);
        for(int i=0;i<times.length;i++){
            if(!adjMap.containsKey(times[i][0]))
                adjMap.put(times[i][0],new ArrayList<int[]>());
            adjMap.get(times[i][0]).add(new int[]{times[i][1],times[i][2]});
        }
        pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int node[]=pq.poll();
            if(distMap.containsKey(node[0]))
                continue;
            distMap.put(node[0],node[1]);
            if(adjMap.containsKey(node[0])&& adjMap.get(node[0])!=null){
                for(int[]dist:adjMap.get(node[0])){
                    if(!distMap.containsKey(dist[0])){
                        pq.add(new int[]{dist[0],dist[1]+node[1]});
                    }
                }
            }
        }
        if(distMap.size()!=n) return -1;
        int ans=0;
        for(int i:distMap.values()){
            ans=Math.max(ans,i);
        }

        return ans;
    }
}
