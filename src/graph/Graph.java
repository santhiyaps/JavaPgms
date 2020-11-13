package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    int vertices; //Total number of vertices in graph
    DoublyLinkedList<Integer> adjacencyList[]; //An array of linked lists to store adjacent vertices.
    Graph(int vertices){
        this.vertices=vertices;
        adjacencyList=new DoublyLinkedList[vertices];
        for(int i=0;i<vertices;i++){
            adjacencyList[i]=new DoublyLinkedList<>();
        }
    }

    public void addEdge(int source, int destination){
        if (source < vertices && destination < vertices){
            this.adjacencyList[source].insertAtEnd(destination);

            //for undirected graph uncomment the line below
            //this.adjacencyList[destination].insertAtEnd(source);
        }
    }
    public void printGraph()
    {
        System.out.println(">>Adjacency List of Directed Graph<<");
        for (int i = 0; i < vertices; i++)
        {
            if(adjacencyList[i]!=null){
                System.out.print("|" + i + "| => ");

                DoublyLinkedList<Integer>.Node temp = adjacencyList[i].getHeadNode();
                while (temp != null)
                {
                    System.out.print("[" + temp.data + "] -> ");
                    temp = temp.nextNode;
                }
                System.out.println("null");
            }
            else{

                System.out.println("|" + i + "| => "+ "null");
            }
        }
    }


}
class CheckBFS {
    public static String bfs(Graph g){
        String result = "";
        if(g.vertices<1) return result;
       boolean[]visited=new boolean[g.vertices];
        for(int i=0;i<g.vertices;i++) {
            if (!visited[i]) {
                visited[i] = true;
                result += i;
                if (g.adjacencyList[i] != null) {
                    DoublyLinkedList<Integer>.Node temp = g.adjacencyList[i].getHeadNode();
                    while (temp != null) {
                        if (!visited[temp.data]) {
                            result += temp.data;
                            visited[temp.data] = true;
                        }
                        temp = temp.nextNode;
                    }
                }

            }
        }
        return result;
    }

    public static void main(String args[]) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        System.out.println("Graph1:");
        g.printGraph();
        System.out.println("BFS traversal of Graph1 : " + bfs(g));
        System.out.println();

        Graph g2 = new Graph(5);
        g2.addEdge(0,1);
        g2.addEdge(0,4);
        g2.addEdge(1,2);
        g2.addEdge(3,4);
        System.out.println("Graph2:");
        g2.printGraph();
        System.out.println("BFS traversal of Graph2 : " + bfs(g2));
    }
}
