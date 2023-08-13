class Solution {  //Binary search algo
    public int searchInsert(int[] nums, int target) {
        int mid, left=0,right=nums.length-1;
        while(left<right){
            mid = left+(right-left)/2;
            //System.out.println(mid);
            if(nums[mid]==target) return mid;
            if(target<nums[mid]) right=mid;
            else left=mid+1;
        }
        //condition for the absence of element
        //condition for the last element
        if(nums[left]<target) return left+1;
        else return left; 
    }
}