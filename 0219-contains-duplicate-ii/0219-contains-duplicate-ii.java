class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i=0; int j=0;
        while (i<nums.length) {
            while(set.size()<=k && j<nums.length){
                if(!set.contains(nums[j]))
                    set.add(nums[j++]);
                else
                    return true;
            }
            set.remove(nums[i++]);
        }
        return false;
    }
}