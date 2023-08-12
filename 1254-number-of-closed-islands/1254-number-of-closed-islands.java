class Solution {
    public int closedIsland(int[][] grid) {
        int count=0;
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]==0 && !visit[i][j] && dfs(i, j, grid, visit)) {
                    ++count;
                }
            }
        }
        return count;
    }
    
    public boolean dfs(int r, int c, int[][] grid, boolean[][] visit) {
        
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length)
            return false;
        
        if(grid[r][c]==1 || visit[r][c])
            return true;
        
        visit[r][c]=true;
        boolean isClosed = true;
        
        if(!dfs(r,c+1,grid,visit))
            isClosed=false;
        if(!dfs(r+1,c,grid,visit))
            isClosed=false;
        if(!dfs(r,c-1,grid,visit))
            isClosed=false;
        if(!dfs(r-1,c,grid,visit))
            isClosed=false;
        
        /*if(!dfs(r,c+1,grid,visit) || !dfs(r+1,c,grid,visit) || !dfs(r,c-1,grid,visit) || !dfs(r-1,c,grid,visit))
            isClosed=false;*/
        
        return isClosed;
    }
}