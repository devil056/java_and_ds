class DFSAdjacentMatrix2 {
    static int[][] adjMatrix;
    static void addEdge(int x, int y){
        adjMatrix[x][y]=1;
//        adjMatrix[y][x]=1;
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
        int v=8;
        int e=11;
        adjMatrix=new int[v][v];
        addEdge(1,5);
        addEdge(1,6);
        addEdge(2,0);
        addEdge(2,5);
        addEdge(4,2);
        addEdge(4,6);
        addEdge(5,6);
        addEdge(5,3);
        addEdge(6,5);
        addEdge(7,5);
        addEdge(7,6);
        boolean[] visited=new boolean[v];
        dfs(2,visited);
    }
}
