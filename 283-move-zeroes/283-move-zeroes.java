class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        // int count=0;
        // for(int x=0;x<nums.length;x++){
        //     if(nums[x]==0){
        //         ++count;
        //     }
        // }
        // int check=0;
        int k = nums.length-1;
        while(i<k){
            if(nums[i]==0 /*&& check<=count*/){
                //++check;
                for(int j=i+1;j<nums.length;j++){
                    nums[j-1]=nums[j];
                }
                nums[k]=0;
                --k;
            }else{
                ++i;
            }
        }
        
        
        /*int index=0;
    		for (int i=0;i<nums.length;i++){
    			if (nums[i]!=0) nums[index++]=nums[i];
    		}
    		while(index<nums.length){
    			nums[index++]=0;
    		}*/
    }
}