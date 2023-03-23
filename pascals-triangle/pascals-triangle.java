class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        
        for(int i=1;i<=numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            if(i==1){
                row.add(1);
                output.add(row);
            }else if(i==2){
                row.add(1);
                row.add(1);
                output.add(row);
                temp=row;
            }else{
                 row.add(1);
            for(int j=0;j<temp.size()-1;j++){
               
                row.add(temp.get(j) + temp.get(j+1));
                
                }
                row.add(1);
                temp=row;
                output.add(row);   
            }
        }
        return output;
    }
}