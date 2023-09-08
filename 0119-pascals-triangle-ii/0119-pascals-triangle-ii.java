class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            if(i==0){
                row.add(1);
                result=row;
            } else if(i==1){
                row.add(1);
                row.add(1);
                result=row;   
            } else {
                row.add(1);
                for(int j=0; j<result.size()-1; j++){
                    row.add(result.get(j)+result.get(j+1));
                }
                row.add(1);
                result=row;
            }
        }
        return result;
    }
}