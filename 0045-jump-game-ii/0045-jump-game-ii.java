class Solution {
    public int jump(int[] nums) {  //greedy approach
        int left=0, right=0;
        int result=0, further=0;
        while(right<nums.length-1) {
            further=0;
            for(int i=left; i<=right; i++)
                further = Math.max(further, nums[i]+i);
            left = right+1;
            right = further;
            ++result;
        }
        return result;
    }
}