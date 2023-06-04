class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int zeroCount=0;
        int zeroIndex=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                product=product*nums[i];
            else{
                zeroIndex=i;
                ++zeroCount;
            }        
        }
        
        int[] result = new int[nums.length];
        
        if(zeroCount==0){
            for(int j=0;j<nums.length;j++)
                result[j] = product/nums[j];
        }else if(zeroCount>1){ 
    //If there are more than 1 zero then the output will have all zero
            for(int k=0;k<result.length;k++)
                result[k]=0;
        }else{
            for(int k=0;k<result.length;k++)
                result[k]=0;
            
            result[zeroIndex]=product;           
        }            
        return result;        
    }
}