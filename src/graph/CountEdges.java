package graph;

public class CountEdges {
    public static int numEdges(Graph g) {
        int num=-1;
        int indegrees[]=new int[g.vertices];
        for(int i=0;i<g.vertices;i++){
            DoublyLinkedList<Integer>.Node temp=g.adjacencyList[i].getHeadNode();
            while (temp != null)
            {
                indegrees[temp.data]++;
                temp = temp.nextNode;
            }
        }
        for(int e:indegrees){
            num+=e;
        }
        return num;
    }

    public static void main(String[] args) {

       /* 0 - 1, 0 - 4,
                1 - 2, 1 - 3,
                4 - 2, 4 - 5,
                2 - 5,
                5 - 6, 5 - 7, 5 - 3,
                6 - 7*/
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(4,2);
        g.addEdge(4,5);
        g.addEdge(2,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(5,3);
        g.addEdge(6,7);
        System.out.println("Graph1:");
        g.printGraph();

        System.out.println(numEdges(g));
    }
}
