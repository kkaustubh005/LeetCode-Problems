class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0; int j=nums.length-1;
        int count=0;
        int total=0;
        
        while(i<j){
            total=nums[i]+nums[j];
            if(total>k){
                --j;
            }else if(total<k){
                ++i;
            }else{
                ++i;
                --j;
                ++count;
            }
            total=0;
        }
        return count;
    }
}