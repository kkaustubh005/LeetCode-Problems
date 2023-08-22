class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        for(int i=0; i<nums.length-2; i++) {
            int j=i+1;
            int k=nums.length-1; 
            while(j<k) {
                while(nums[j]-nums[i]<diff && j<k)
                    ++j;
                
                while(nums[k]-nums[j]>diff && k>j) 
                    --k;
                 
                if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff)
                    ++count; 
                
                break;
            }
        }
        return count;
    }
}