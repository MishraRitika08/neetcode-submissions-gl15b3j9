class Solution {
    private ArrayList<ArrayList<Integer>> createGraph(int[][] edges, int V){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return graph;
    }
    private void dfs(ArrayList<ArrayList<Integer>> graph, int s, boolean[] visited){
        visited[s] = true;
        for(int i: graph.get(s)){
            if(!visited[i]){
                dfs(graph, i, visited);
            }
        }
    }
    public int countComponents(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = createGraph(edges, V);
        boolean visited[] = new boolean[V];
        int count  = 0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                count++;
                dfs(graph, i, visited);
            }
        }
        return count;
    }
}