class Solution {
    public int search(int[] nums, int target) {
        
    int mid, left = 0, right = nums.length - 1;
    while (left <= right) {
      mid = left + (right - left) / 2;
      if (nums[mid] == target) return mid;
      if (target < nums[mid]) right = mid - 1;
      else left = mid + 1;
    }
    return -1;
        /*
        int len=nums.length;
        int mid = len/2;
        
        if(target==nums[mid]) return mid;
        
        if(target<nums[mid]){
            for(int i=0;i<mid;i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }else if(target>nums[mid]){
            for(int j=mid+1;j<len;j++){
                if(nums[j]==target){
                    return j;
                }
            }
        }
        return -1;*/
    }
}