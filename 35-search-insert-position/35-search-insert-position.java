class Solution {
    public int searchInsert(int[] nums, int target) {
        // int check=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         check=1;
        //     }
        // }
        int mid, left=0,right=nums.length-1;
        while(left<right){
            mid = left+(right-left)/2;
            System.out.println(mid);
            if(nums[mid]==target) return mid;
            if(target<nums[mid]) right=mid;
            else left=mid+1;
        }
        System.out.println("Left:"+left);
        System.out.println("Right:"+right);
        if(nums[left]<target) return right+1;
        else return right;
    }
}