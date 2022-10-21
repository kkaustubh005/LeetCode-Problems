class Solution {
    public int orangesRotting(int[][] grid) {  //Using BFS
        Queue<Pair<Integer, Integer>> queue = new ArrayDeque();
        // Step 1). build the initial set of rotten oranges
        int freshOranges = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        
        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                if(grid[i][j] == 2)
                    queue.offer(new Pair(i,j));
                else if(grid[i][j] == 1)
                    freshOranges++;
            }
        }
        // Mark the round / level, _i.e_ the ticker of timestamp
        queue.offer(new Pair(-1,-1));
        
         // Step 2). start the rotting process via BFS
        int minuteElapsed = -1;
        int[][] directions = {{-1,0}, {0,1}, {1,0}, {0,-1}};
        
        while(!queue.isEmpty()){
            Pair<Integer, Integer> p = queue.poll();
            int row = p.getKey();
            int col = p.getValue();
            if(row == -1){ // We finish one round of processing
                minuteElapsed++;
                if(!queue.isEmpty())  // to avoid the endless loop
                    queue.offer(new Pair(-1,-1));
            }else{ // this is a rotten orange, then it would contaminate its neighbours
                for(int[] d: directions){
                    int rowNeighbour = row + d[0];
                    int colNeighbour = col + d[1];
                    if(rowNeighbour>=0 && rowNeighbour<ROWS && colNeighbour>=0 && colNeighbour<COLS){
                        if(grid[rowNeighbour][colNeighbour]==1){ // this orange would be contaminated
                            grid[rowNeighbour][colNeighbour]=2;
                            freshOranges--;
                            queue.offer(new Pair(rowNeighbour,colNeighbour));
                        }
                    }
                }
            }            
        }
        if(freshOranges==0)
            return minuteElapsed;
        else
            return -1;       
    }
}