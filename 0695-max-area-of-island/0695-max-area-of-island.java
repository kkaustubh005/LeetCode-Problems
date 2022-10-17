class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxCount=0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) count = dfs(grid,i,j);           
                if(count>maxCount) maxCount = count;
            }
        }
        return maxCount;
    }
    
    public static int dfs(int[][] grid, int row, int col){
        int count=0;
        int rowLength=grid.length;
        int colLength=grid[0].length;
        
        
        //base condition for stopping
        if(row<0 || row>=rowLength || col<0 || col>=colLength || grid[row][col]!=1){
            return count;
        }
        
        ++count;   
        grid[row][col]=0;  //mark visited elements as 0
        
        count+=dfs(grid,row+1,col);
        count+=dfs(grid,row,col+1);
        count+=dfs(grid,row-1,col);
        count+=dfs(grid,row,col-1);
        
        return count;
    }
}