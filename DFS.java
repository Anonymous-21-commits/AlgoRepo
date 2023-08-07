class DFS {
    public static void dfs(int[][] graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] graph = {
            {1, 2},
            {0, 2, 3},
            {0, 1, 3},
            {1, 2}
        };
        
        int numNodes = graph.length;
        boolean[] visited = new boolean[numNodes];
        
        dfs(graph, 0, visited); // Start DFS from node 0
    }
}
