class Solution {
    int[] DIR = new int[]{0, 1, 0, -1, 0};
    public int[][] updateMatrix(int[][] mat) {
        /*int res=0;
        int[][] result = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    //System.out.println(mat[i][j]);
                    res=dfs(mat,i,j,result);
                    //System.out.println(res);
                    result[i][j]=res;
                }else{
                    result[i][j]=0;
                }
            }            
        }
        return result;
    }
    
    public static int dfs(int[][] mat, int row, int col, int[][] result){
        int rowLength=mat.length;
        int colLength=mat[0].length;
        int dist=0;
        
        if(row<0 || row>=rowLength || col<0 || col>=colLength || mat[row][col]==0){
            return dist;
        }
        
        ++dist;
        mat[row][col]=0;
        
        int d1+=dfs(mat,row+1,col,result);
        System.out.println("d1- "+d1);
        int d2+=dfs(mat,row,col+1,result);
        System.out.println("d2- "+d2);
        int d3+=dfs(mat,row-1,col,result);
        System.out.println("d3- "+d3);
        int d4+=dfs(mat,row,col-1,result);
        System.out.println("d4- "+d4);
        
        int min1 = Math.min(d1,d2);
        int min2 = Math.min(d3,min1);
        int min3 = Math.min(d4,min2);
        System.out.println("min3- "+min3);
        return min3;*/
        
        int m = mat.length, n = mat[0].length; // The distance of cells is up to (M+N)
        Queue<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < m; ++r)
            for (int c = 0; c < n; ++c)
                if (mat[r][c] == 0) q.offer(new int[]{r, c});
                else mat[r][c] = -1; // Marked as not processed yet!

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];
            for (int i = 0; i < 4; ++i) {
                int nr = r + DIR[i], nc = c + DIR[i+1];
                if (nr < 0 || nr == m || nc < 0 || nc == n || mat[nr][nc] != -1)                             continue;
                mat[nr][nc] = mat[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
        return mat;
    }
}