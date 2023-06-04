class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zeroCount=0;
        ArrayList<Integer> zeroListIndex = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                product=product*nums[i];
            else{
                zeroListIndex.add(i);
                ++zeroCount;
            }        
        }
        
        int[] result = new int[nums.length];
        
        if(zeroCount==0){
            for(int j=0;j<nums.length;j++)
                result[j] = product/nums[j];
        }else if(zeroCount>1){
            for(int k=0;k<result.length;k++)
                result[k]=0;
        }else{
            for(int k=0;k<result.length;k++)
                result[k]=0;
            for(int l:zeroListIndex)
                result[l]=product;
        }
            
        return result;
        
        
    }
}