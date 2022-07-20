class Solution {

    private Map<Integer, Integer> count = new HashMap<>(Map.of(0,0,1,1,2,2,3,3));
    public int climbStairs(int n) {
        if(count.containsKey(n)){
                return count.get(n);
        }
        count.put(n, climbStairs(n-1)+climbStairs(n-2));
        return count.get(n);
        
        
    }
}