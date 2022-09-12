class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean [][] visited = new boolean[image.length][image[0].length];
        dfs(image,sr,sc,color,image[sr][sc],visited);
        return image;
    }
    
    public static void dfs(int[][] image, int sr, int sc, int color, int baseColor, boolean[][] visited ){
        int rowLength = image.length;
        int colLength = image[0].length;
        
        //Base case of return
        if(sr<0 || sr>=rowLength || sc<0 || sc>=colLength || image[sr][sc]!=baseColor || visited[sr][sc]){
            return;
        }
        
        //Mark the node as visited
        visited[sr][sc] = true;
        
        //What operation needs to be performed at every node(check for it 4 directional neighbours)
        image[sr][sc] = color;
        dfs(image,sr+1,sc,color,baseColor,visited);
        dfs(image,sr,sc+1,color,baseColor,visited);
        dfs(image,sr-1,sc,color,baseColor,visited);
        dfs(image,sr,sc-1,color,baseColor,visited);
    }
}