class Solution {   //DP - Iterative approach Bottom - up 
    public int minCostClimbingStairs(int[] cost) {
        int one=0;
        int two=0;
        for(int i=cost.length-1; i>=0; i--) {
            cost[i]+=Math.min(one, two);
            two=one;
            one=cost[i];
        }
        return Math.min(cost[0], cost[1]);
    }
}

/*
class Solution { //Top-down approach (Memoization + Recursion )
   private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    
    public int minCostClimbingStairs(int[] cost) {
        return minCost(cost.length, cost);
    }
    
    private int minCost(int i, int[] cost) {
        //Base case
        if(i<=1) return 0;
        
        if(memo.containsKey(i)) return memo.get(i);
        
        //Recurrence relation
        int oneStepDown = cost[i-1] + minCost(i-1, cost);
        int twoStepDown = cost[i-2] + minCost(i-2, cost);
        memo.put(i, Math.min(oneStepDown, twoStepDown));
        return memo.get(i);
    
    
    }
}
*/