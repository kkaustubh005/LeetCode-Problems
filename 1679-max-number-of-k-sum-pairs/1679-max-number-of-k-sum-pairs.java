class Solution {
    public int maxOperations(int[] nums, int k) {
        /*Arrays.sort(nums);
        int i=0; int j=nums.length-1;
        int count=0;
        int total=0;
        
        while(i<j){
            total=nums[i]+nums[j];
            if(total>k){
                --j;
            }else if(total<k){
                ++i;
            }else{
                ++i;
                --j;
                ++count;
            }
            total=0;
        }
        return count;*/
        
        //More optimised, using HashMap
        
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int complement=k-current;
            
            if(map.getOrDefault(complement,0)>0){
                map.put(complement,map.get(complement)-1);
                ++count;
            }else{
                map.put(current,map.getOrDefault(current,0)+1);
            }
        }
        return count;
    }
}