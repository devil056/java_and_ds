import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Iterator;
import java.util.LinkedList;

class Graph3 {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    Graph3(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    void DFS(int vertex) {
        visited[vertex] = true;
        System.out.println(vertex + " ");
        Iterator<Integer> ite = adjLists[vertex].listIterator();

        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }

    public static void main(String args[]) {
        Graph3 g1 = new Graph3(4);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(2, 3);
        System.out.println("this is the dfs traversal");
        g1.DFS(2);
    }
}