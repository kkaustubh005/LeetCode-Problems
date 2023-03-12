class Solution {
    public boolean isPalindrome(int x) {
        // String s = Integer.toString(x);
        // char[] arr = s.toCharArray();
        // int i=0;
        // int j=arr.length-1;
        // while(i<j){
        //     if(arr[i]!=arr[j]) return false;
        //     ++i;
        //     --j;
        // }
        // return true;
        //Without converting to String solution-
        
        if(x<0) return false;
        int reversed=0, remainder, original=x;
        while(x!=0){
            remainder = x%10;
            reversed = reversed*10 + remainder;
            x=x/10;
        }
        return original==reversed;
    }
}