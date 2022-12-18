class Solution {
    public boolean isPowerOfTwo(int n) {
        double result=0;int i=0;
        if(n==0)
            return false;
        
        while(result<n) {      
            result=Math.pow(2,i);
            ++i;
        }
        
        if(result==n)
            return true;
        return false;
    }
}