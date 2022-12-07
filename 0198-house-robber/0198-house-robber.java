class Solution {  //DP, top-down approach (memoization)
    HashMap<Integer, Integer> memo = new HashMap<>();
    private int[] nums;
    
    private int dp(int i) {
        //base case
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[0], nums[1]);
        
        //Recurrence relation
        if(!memo.containsKey(i))
            memo.put(i, Math.max(dp(i-1), dp(i-2) + nums[i]));
        
        return memo.get(i); 
    }
    
    public int rob(int[] nums) {
        this.nums=nums;
        return dp(nums.length-1);      
    }
}

/* //Logic for recurrence Relation//
If we are at some house, logically, we have 2 options: we can choose to rob this house, or we can choose to not rob this house.
- If we decide not to rob the house, then we don't gain any money. Whatever money we had from the previous house is how much money we will have at this house - which is dp(i - 1).
- If we decide to rob the house, then we gain nums[i] money. However, this is only possible if we did not rob the previous house. This means the money we had when arriving at this house is the money we had from the previous house without robbing it, which would be however much money we had 2 houses ago, dp(i - 2). After robbing the current house, we will have dp(i - 2) + nums[i] money.
*/