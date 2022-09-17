class Solution {
    public int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length]; 
        for(int col=0;col<grid[0].length;col++){          
            result[col]=dfs(grid,0,col);
        }       
        return result;
    }
    
    public static int dfs(int[][] grid, int row, int col){
        int rowLength = grid.length;
        int colLength = grid[0].length;
        
        if(row==rowLength){
            return col;
        }        
        if(grid[row][col]==1 && col+1<colLength && grid[row][col+1]==1){
            return dfs(grid,row+1,col+1);
        }
        if(grid[row][col]==-1 && col-1>=0 && grid[row][col-1]==-1){
            return dfs(grid,row+1,col-1);
        }    
        
        return -1;  
    }
}