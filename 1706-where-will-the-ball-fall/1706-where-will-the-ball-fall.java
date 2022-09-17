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
        
        //boundary conditions
        if(row==rowLength){
            return col;
        }
        
        //start and end condition(edge case)
        // if(grid[row][colLength-1]==1 || grid[row][0]==-1){
        //     //System.out.println("start ball: "+start);
        //     //result.add(start,-1);
        //     return -1;
        // }
            
        /*if(grid[rowLength-1][col]==1 && grid[rowLength-1][col+1]==1){
            System.out.println("add start ball: "+start);
            System.out.println("ans: "+col);
            result.add(start,col);
            return;
        }
        
        if(grid[rowLength-1][col] != 1 && grid[rowLength-1][col-1] !=1){
            System.out.println("add start ball: "+start);
            //System.out.println("ans: "+col-1);
            result.add(start,col);
            return;
        }*/
        
        if(grid[row][col]==1 && col+1<grid[0].length && grid[row][col+1]==1){
            return dfs(grid,row+1,col+1);
        }
        else if(grid[row][col]==-1 && col-1>=0 && grid[row][col-1]==-1){
            return dfs(grid,row+1,col-1);
        }
        
      return -1;  
    }
}