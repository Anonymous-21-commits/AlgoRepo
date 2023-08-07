import java.util.*;

class BFS {
    public static void bfs(int[][] graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        
        queue.offer(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
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
        
        bfs(graph, 0); // Start BFS from node 0
    }
}
