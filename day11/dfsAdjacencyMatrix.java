class DFSAdjacencymatrix {

    static int [][] adjMatrix;

    static void addEdge(int x,int y){
        adjMatrix[x][y]=1;
        adjMatrix[y][x]=1;

    }
    static void dfs(int start , boolean[] visited){

        System.out.println(start+" ");
        visited[start]=true;

        for(int i=0;i<adjMatrix[start].length;i++){

            if (adjMatrix[start][i]==1 && (!visited[i])){
                dfs(i,visited);
            }
        }
    }

    public static void main(String args[]){
        int v=5;
        int e=4;

        adjMatrix=new int[v][v];
        addEdge(0,1);
        addEdge(0,2);
        addEdge(0,3);
        addEdge(0,4);

        boolean[] visited=new boolean[v];

        dfs(0,visited);
    }
}