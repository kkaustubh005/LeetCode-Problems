class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int count=0;
        for(int x=0;x<nums.length;x++){
            if(nums[x]==0){
                ++count;
            }
        }
        int check=0;
        while(i<nums.length-1){
            if(nums[i]==0 && check<=count){
                ++check;
                for(int j=i+1;j<nums.length;j++){
                    nums[j-1]=nums[j];
                }
                nums[nums.length-1]=0;
            }else{
                ++i;
            }
        }
        
    }
}