class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rowSet = null;
        HashSet<Character> colSet = null;
        
        //Check rows and columns
        for(int i=0; i<board.length; i++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for(int j=0; j<board[0].length; j++) {
                char row = board[i][j];
                char col = board[j][i];
                
                if(row!='.') {
                    if(rowSet.contains(row))
                        return false;
                    else
                        rowSet.add(row);
                }
                if(col!='.') {
                    if(colSet.contains(col))
                        return false;
                    else
                        colSet.add(col);
                }
            }
        }
        
        //check 3x3 sub-boxes
        
        for(int i=0; i<board.length; i=i+3) {
            for(int j=0; j<board[0].length; j=j+3) {
                if(!checkSubBox(i, j, board))
                    return false;
            }
        }
        return true;
    }
    
    public boolean checkSubBox(int iVal, int jVal, char[][] board) {
        int rowLen = iVal+3;
        int colLen = jVal+3;
        Set<Character> set = new HashSet<>();
        for(int i=iVal; i<rowLen; i++) {
            for(int j=jVal; j<colLen; j++) {
                if(board[i][j]!='.') {
                    if(set.contains(board[i][j]))
                        return false;
                    else
                        set.add(board[i][j]);
                }
            }
        }
        return true;
    }
}