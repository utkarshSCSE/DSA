class Solution {
    private int[][] graph;
    private boolean[] visited;

    public int findCircleNum(int[][] isConnected) {
        graph = isConnected;
        int n = graph.length;
        visited = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        return count;
    }

    public void dfs(int node) {
        visited[node] = true;

        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}