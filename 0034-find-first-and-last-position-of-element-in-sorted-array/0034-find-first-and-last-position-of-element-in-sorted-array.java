class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        int mid=0;
        int indexS=0; int indexL=0;
        int temp=0;
        while(left<=right) {
            mid = left + (right-left) / 2;
            if(nums[mid]==target) {
                temp=mid;
                indexS=mid;
                indexL=mid;
                while(mid!=0 && nums[mid-1]==target){
                    indexS=mid-1;
                    --mid;
                }
                mid=temp;
                while(mid!=nums.length-1 && nums[mid+1]==target){
                    indexL=mid+1;
                    ++mid;
                }   
                return new int[] {indexS,indexL};
            }
            if(target>nums[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return new int[] {-1,-1};
    }
}