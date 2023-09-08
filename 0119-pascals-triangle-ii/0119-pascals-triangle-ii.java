class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            if(i==0){
                row.add(1);
                temp=row;
            } else if(i==1){
                row.add(1);
                row.add(1);
                temp=row;   
            } else {
                row.add(1);
                for(int j=0; j<temp.size()-1; j++){
                    row.add(temp.get(j)+temp.get(j+1));
                }
                row.add(1);
                temp=row;
            }
        }
        return temp;
    }
}