package graph;
import java.util.*;
class CheckCycle {
    public static boolean detectCycle(Graph g){
        Queue<Integer> queue=new Queue<Integer>(g.vertices);
        HashMap<Integer,List<Integer>>graphMap=new HashMap<Integer,List<Integer>>();
        int[]indegrees=new int[g.vertices];
        int count=0;
        for(int i=0;i<g.vertices;i++){
            DoublyLinkedList<Integer>.Node temp = g.adjacencyList[i].getHeadNode();
            List<Integer>list=new ArrayList<Integer>();
            int key=i;
            while (temp != null)
            {
                list.add(temp.data);
                indegrees[temp.data]++;
                temp = temp.nextNode;
            }
            graphMap.put(key,list);
            System.out.println("null");
        }
        for(int i=0;i<indegrees.length;i++){
            if(indegrees[i]==0)
                queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            int num=queue.dequeue();
            count++;
            List<Integer> list=graphMap.get(num);
            if(list!=null){
                for(int n:list){
                    indegrees[n]--;
                    if(indegrees[n]==0)
                        queue.enqueue(n);
                }
            }
        }
        return count!=g.vertices;
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,1);
        g.addEdge(2,4);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println(detectCycle(g));

    }
}
