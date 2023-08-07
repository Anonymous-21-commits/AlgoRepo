import java.util.*;

class Dijkstra {
    public static void dijkstra(int[][] graph, int start) {
        int numNodes = graph.length;
        int[] distance = new int[numNodes];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{start, 0});
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int dist = curr[1];
            
            if (dist > distance[node]) continue;
            
            for (int i = 0; i < numNodes; i++) {
                if (graph[node][i] != 0) {
                    int newDist = dist + graph[node][i];
                    if (newDist < distance[i]) {
                        distance[i] = newDist;
                        pq.offer(new int[]{i, newDist});
                    }
                }
            }
        }
        
        System.out.println("Shortest distances from node " + start + ": " + Arrays.toString(distance));
    }
    
    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 2, 0, 0, 0},
            {4, 0, 1, 5, 0, 0},
            {2, 1, 0, 8, 10, 0},
            {0, 5, 8, 0, 2, 6},
            {0, 0, 10, 2, 0, 3},
            {0, 0, 0, 6, 3, 0}
        };
        
        dijkstra(graph, 0); // Apply Dijkstra's algorithm from node 0
    }
}
