class Solution {
    public int dfs(int current, List<List<Integer>> edges, boolean[] visited) {
        int result=1;
        visited[current] = true;
        for(int next: edges.get(current)) {
            if(!visited[next]) {
                result+=dfs(next, edges, visited);
            }
        }
        return result;
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return dfs(0, rooms, new boolean[rooms.size()]) == rooms.size();
    }
}