class Solution {
    public int mySqrt(int x) { //binary search approach
        if(x<2)
            return x;       
        //For x≥2 the square root is always smaller than x/2 and larger than 0
        long num;
        int pivot, left=2, right=x/2;
        
        while(left <= right) {
            pivot = left + (right-left)/2;
            num = (long) pivot*pivot;
            if(num>x)
                right = pivot-1;
            else if(num<x)
                left = pivot+1;
            else
                return pivot;
        }
        return right;           
    }
}