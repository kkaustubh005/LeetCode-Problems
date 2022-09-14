class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ++count;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void dfs(char[][]grid, int row, int col){
        int rowLength = grid.length;
        int colLength = grid[0].length;
        //boundary conditions
        if(row<0 || row>=rowLength || col<0 || col>=colLength || grid[row][col]=='0'){
            return;
        }
        //Make the value 1 to 0
        if(grid[row][col]=='1'){
            grid[row][col]='0';
        }
        
        dfs(grid,row+1,col);
        dfs(grid,row,col+1);
        dfs(grid,row-1,col);
        dfs(grid,row,col-1);
        
    }
}