class Solution {
    public void rotate(int[] nums, int k) {
        /*for(int i=0;i<k;i++){
            int last=nums[nums.length-1];
            int length=nums.length;
            int z = nums.length-2;
            while(length>1){
                nums[z+1]=nums[z];
                --length;
                --z;
            }
            nums[0]=last;
        }     */
        //Using extra array
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}