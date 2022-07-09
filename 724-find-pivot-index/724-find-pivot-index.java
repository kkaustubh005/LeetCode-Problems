class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft=0,sumRight=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                sumLeft=sumLeft+nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                sumRight=sumRight+nums[k];
            }
            if(sumLeft==sumRight){
                return i;
            }
            sumLeft=0;
            sumRight=0;
        }
        return -1;
    }
}