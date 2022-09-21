class Solution {
    public void moveZeroes(int[] nums) {
        /*int i=0;
        int k = nums.length-1;
        while(i<k){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    nums[j-1]=nums[j];
                }
                nums[k]=0;
                --k;
            }else{
                ++i;
            }
        }*/
        
        
       // More optimised code 
       int index=0;
    		for (int i=0;i<nums.length;i++){
    			if (nums[i]!=0) nums[index++]=nums[i];
    		}
    		while(index<nums.length){
    			nums[index++]=0;
    		}
    }
}