class Solution { //Top-down approach (Memoization + Recursion )
    private HashMap<Integer, Integer> memo = new HashMap<>();
    
    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost.length, cost);
    }
    
    private int minCost(int i, int[] cost){
        if(i<=1){
            return 0;
        }
        
        if(memo.containsKey(i)){
            return memo.get(i);
        }
        
        int downOne = cost[i-1] + minCost(i-1, cost);
        int downTwo = cost[i-2] + minCost(i-2, cost);
        int min = Math.min(downOne,downTwo);
        memo.put(i, min);
        return memo.get(i);
    }
}