class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int j=0;j<nums.length;j++){
            int output=target-nums[j];
            if(map.containsKey(output) && map.get(output)!=j){
                result[0]=map.get(output);
                result[1]=j;
            }
        }
        return result;
        
    }
}