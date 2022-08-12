import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProblemBFS{
    static class Graph101{
        static int v,e;
        static int[][] adj;
        Graph101(int v,int e){
            this.v=v;
            this.e=e;

            adj=new int[v][v];
            for(int row=0;row<v;row++){
                Arrays.fill(adj[row],0);
            }
        }

        static void addEdge(int start,int e){
            adj[start][e]=1;
            adj[e][start]=1;
        }

        static void bfs(int start){
            boolean[] visited=new boolean[v];
            Arrays.fill(visited,false);
            List<Integer> q=new ArrayList<>();
            q.add(start);

            visited[start]=true;

            int vis;
            while(!q.isEmpty()){
                vis=q.get(0);
                System.out.println(vis+" ");
                q.remove(q.get(0));

                for(int i=0;i<v;i++){
                    if(adj[vis][i]==1 && (!visited[i])){
                        q.add(i);
                        visited[i]=true;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int v=5,e=5;
        Graph101 g=new Graph101(v,e);
        Graph101.addEdge(0,1);
        Graph101.addEdge(0,2);
        Graph101.addEdge(0,3);
        Graph101.addEdge(1,2);
        Graph101.addEdge(2,4);
        g.bfs(4);
    }
}