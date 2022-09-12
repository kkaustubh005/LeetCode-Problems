class Solution {
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return dfs(grid,i,j,visited);
                }
            }
        }
        return 0;
    }
    
    public static int dfs(int[][]grid,int row, int col, boolean[][]visited){
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int count=0;
        
        //Boundary conditions, return 1
        if(row<0 || row>=rowLength || col<0 || col>=colLength) return 1;
        
        //If cell is water
        if(grid[row][col]==0) return 1;
        
        //If already visited
        if(visited[row][col]) return 0;
        
        //If visited mark true
        visited[row][col] = true;
        count+=dfs(grid,row+1,col,visited);
        count+=dfs(grid,row,col+1,visited);
        count+=dfs(grid,row-1,col,visited);
        count+=dfs(grid,row,col-1,visited);
        
        return count;    
    }
}