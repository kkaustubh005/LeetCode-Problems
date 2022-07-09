class Solution {
    public int pivotIndex(int[] nums) {
        /*Working sol- O(n2) time complexity
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
        return -1;*/
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int sumLeft=0;
        int sumRight=0;
        if(sum-nums[0]==0){
            return 0;
        }
        for(int j=1;j<nums.length;j++){
            sumLeft=sumLeft+nums[j-1];
            sumRight=sum-sumLeft-nums[j];
            if(sumRight==sumLeft){
                return j;
            }
            sumRight=sum;
            
        }
        return -1;
    }
}