import java.util.*;

public class Main {

    static int V;
    static int[][] capacity;

    static boolean dfs(int u, int sink, boolean[] visited, int[] parent) {
        visited[u] = true;

        if (u == sink)
            return true;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && capacity[u][v] > 0) {
                parent[v] = u;

                if (dfs(v, sink, visited, parent))
                    return true;
            }
        }

        return false;
    }

    static int fordFulkerson(int source, int sink) {
        int maxFlow = 0;
        int[] parent = new int[V];

        while (true) {
            boolean[] visited = new boolean[V];
            Arrays.fill(parent, -1);

            if (!dfs(source, sink, visited, parent))
                break;

            int pathFlow = Integer.MAX_VALUE;

            int v = sink;

            while (v != source) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, capacity[u][v]);
                v = u;
            }

            v = sink;

            while (v != source) {
                int u = parent[v];

                capacity[u][v] -= pathFlow;
                capacity[v][u] += pathFlow;

                v = u;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        int E = sc.nextInt();

        capacity = new int[V][V];

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int c = sc.nextInt();

            capacity[u][v] += c;
        }

        int source = 0;
        int sink = V - 1;

        System.out.println(fordFulkerson(source, sink));

        sc.close();
    }
}
