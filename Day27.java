import java.util.*;

public class ShortestPathUnweightedGraph {
    public static int shortestPath(int V, int[][] edges, int start, int end) {
        // Step 1: Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]); // undirected graph
        }

        // Step 2: BFS
        boolean[] visited = new boolean[V];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0}); // node, distance
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int dist = curr[1];

            // If destination reached
            if (node == end) {
                return dist;
            }

            // Visit neighbors
            for (int nei : graph.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    queue.offer(new int[]{nei, dist + 1});
                }
            }
        }

        // No path found
        return -1;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4}
        };
        int start = 0, end = 4;

        System.out.println(shortestPath(V, edges, start, end)); // Output: 3
    }
}
