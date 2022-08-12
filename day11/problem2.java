class DFSAdjacentMatrix3 {
    static int[][] adjMatrix;
    static void addEdge(int x, int y){
        adjMatrix[x][y]=1;
        adjMatrix[y][x]=1;
    }
    static void dfs(int start, boolean[] visited){
        System.out.println(start+" ");
        visited[start]=true;
        for(int i=0;i<adjMatrix[start].length;i++){
            if(adjMatrix[start][i]==1 && (!visited[i]))
                dfs(i,visited);
        }
    }
    public static void main(String[] args){
        int v=13;
        int e=15;
        adjMatrix=new int[v][v];
        addEdge(0,1);
        addEdge(0,4);
        addEdge(1,2);
        addEdge(1,5);
        addEdge(2,3);
        addEdge(2,6);
        addEdge(4,8);
        addEdge(5,6);
        addEdge(5,10);
        addEdge(6,11);
        addEdge(7,12);
        addEdge(8,9);
        addEdge(9,10);
        addEdge(10,11);
        addEdge(11,12);
        boolean[] visited=new boolean[v];
        dfs(2,visited);
    }
}
