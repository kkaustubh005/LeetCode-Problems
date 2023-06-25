class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<Integer, List<Integer>> mapRow = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> listRow = new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                listRow.add(grid[i][j]);
            }
            mapRow.put(i,listRow);
        }
        
        HashMap<Integer, List<Integer>> mapCol = new HashMap<>();
        for(int i=0;i<grid[0].length;i++){
            ArrayList<Integer> listCol = new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                listCol.add(grid[j][i]);
            }
            mapCol.put(i,listCol);
        }
        
        int count=0;
        
        for(int i=0;i<mapRow.size();i++){
            for(int j=0;j<mapCol.size();j++){
                if(mapRow.get(i).equals(mapCol.get(j)))
                    ++count;
            }
        }
        return count;       
    }
}