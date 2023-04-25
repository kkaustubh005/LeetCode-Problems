class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Using Sliding Window
        int min=Integer.MAX_VALUE; int sum=0;int count=0; int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                count=i+1-left;
                min=Math.min(min,count);
                sum-=nums[left++];
            }
        }
        if(min!=Integer.MAX_VALUE)
            return min;
        else
            return 0;
    }
}