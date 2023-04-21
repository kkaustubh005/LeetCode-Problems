class Solution {
    public void solve(char[][] board) {
        int rowLength = board.length;
        int colLength = board[0].length;
        
        //Traverse from the boundaries
        for(int i=0;i<rowLength;i++){
            if(board[i][0]=='O')
                dfs(board,i,0);
            if(board[i][colLength-1]=='O')
                dfs(board,i,colLength-1);
        }
        
        for(int i=0;i<colLength;i++){
            if(board[0][i]=='O')
                dfs(board,0,i);
            if(board[rowLength-1][i]=='O')
                dfs(board,rowLength-1,i);
        }
        
        
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='V')
                    board[i][j]='O';
            }
        }
    }
    
    public static void dfs(char[][] board, int row, int col){
        int rowLength = board.length;
        int colLength = board[0].length;
        
        //boundary conditions
        if(row<0 || row>=rowLength || col<0 || col>=colLength || board[row][col]!='O'){
            return;
        }
        
        if(board[row][col]=='O'){
            board[row][col]='V';
        }
                
        dfs(board,row+1,col);
        dfs(board,row,col+1);
        dfs(board,row-1,col);
        dfs(board,row,col-1);
    }
}