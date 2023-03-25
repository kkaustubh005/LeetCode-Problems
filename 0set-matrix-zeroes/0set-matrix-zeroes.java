class Solution {
    public void setZeroes(int[][] matrix) {
        //List<Integer> row = new ArrayList<>();
        //List<Integer> col = new ArrayList<>();
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            if(row.contains(i)){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int x=0;x<matrix[0].length;x++){
            if(col.contains(x)){
                for(int y=0;y<matrix.length;y++){
                    matrix[y][x]=0;
                }
            }
        }
        
        
    }
}