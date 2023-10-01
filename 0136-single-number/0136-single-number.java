class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int x:nums){
        //     if(map.containsKey(x)){
        //         map.put(x,map.get(x)+1);
        //     }else{
        //         map.put(x,1);
        //     }
        // }
        // for(int res:nums){
        //     if(map.get(res)==1){
        //         return res;
        //     }
        // }
        // return 0;
        
        //Using XOR opertation
        //We can use xor operation as it cancel out itself (i.e. only when values are different in binary representation then give output). See how xor operation works if confused.
/* 0^0=0
1^1=0
0^1=1
1^0=1
n^0=n
*/
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) 
            ans ^= nums[i];
        return ans;
    }
}