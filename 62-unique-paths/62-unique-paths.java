class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        
        for(int[] arr: memo){
            Arrays.fill(arr,1);
        }
        
        for(int col=1;col<m;col++){
            for(int row=1;row<n;row++){
                memo[col][row] = memo[col-1][row] + memo[col][row-1];
            }
        }
        return memo[m-1][n-1];
    }
}