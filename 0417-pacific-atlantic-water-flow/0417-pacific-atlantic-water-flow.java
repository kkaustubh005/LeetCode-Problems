class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rowLen = heights.length;
        int colLen = heights[0].length;
        boolean[][] pOcean = new boolean[rowLen][colLen];
        boolean[][] aOcean = new boolean[rowLen][colLen];
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<rowLen; i++){
            dfs(i,0,heights,pOcean,heights[i][0]);
            dfs(i,colLen-1,heights,aOcean,heights[i][colLen-1]);
        }
        
        for(int i=0; i<colLen; i++){
            dfs(0,i,heights,pOcean,heights[0][i]);
            dfs(rowLen-1,i,heights,aOcean,heights[rowLen-1][i]);
        }
        
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(pOcean[i][j] && aOcean[i][j]){
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(i);
                    tempList.add(j);
                    list.add(tempList);
                }
            }
        }
        return list;
        
    }
    
    public void dfs(int row, int col, int[][] heights, boolean[][] visited, int prev){
        int rowLen = heights.length;
        int colLen = heights[0].length;
        
        if(row<0 || row>=rowLen || col<0 || col>=colLen || prev>heights[row][col] || visited[row][col]){
            return;
        }
        
        visited[row][col] = true;
        
        dfs(row+1,col,heights,visited,heights[row][col]);
        dfs(row,col+1,heights,visited,heights[row][col]);
        dfs(row-1,col,heights,visited,heights[row][col]);
        dfs(row,col-1,heights,visited,heights[row][col]);
          
    }
    
}