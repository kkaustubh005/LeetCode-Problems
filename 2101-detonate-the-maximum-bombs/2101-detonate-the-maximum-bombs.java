class Solution {
    public int maximumDetonation(int[][] bombs) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        int n = bombs.length;
        
        //build adjacency list
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==j)
                    continue;
                if((long) bombs[i][2] * bombs[i][2] >= (long) (bombs[i][0]-bombs[j][0])*(bombs[i][0]-bombs[j][0]) +  (long) (bombs[i][1]-bombs[j][1])*(bombs[i][1]-bombs[j][1])) {
                    if(graph.containsKey(i))
                        graph.get(i).add(j);
                    else{
                        graph.put(i, new ArrayList<>());
                        graph.get(i).add(j);
                    }
                    //graph.put(i, graph.getOrDefault(i, new ArrayList<>()).add(j));
                }
            }
        }
        
        int answer=0;
        for(int i=0; i<n; i++) {
            int count = dfs(i, new HashSet<>(), graph);
            answer = Math.max(answer, count);
        }
        return answer;
    }
    
    private int dfs(int cur, Set<Integer> visited, HashMap<Integer, List<Integer>> graph) {
        int count=1;
        visited.add(cur);
        
        for(int a: graph.getOrDefault(cur, new ArrayList<>())) {
            if(!visited.contains(a))
                count+=dfs(a, visited, graph);
        }
        return count;
    }
}