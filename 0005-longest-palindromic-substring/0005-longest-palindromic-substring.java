class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s;
        int resultLength=0;
        String result="";
        
        for(int i=0; i<s.length(); i++) {
            //For odd length
            int left=i;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
                if(right-left+1>resultLength){
                    resultLength=right-left+1;
                    result=s.substring(left, right+1);
                }
                --left;
                ++right;
            }
            
            //For even length     
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
                if(right-left+1>resultLength){
                    resultLength=right-left+1;
                    result=s.substring(left, right+1);
                }
                --left;
                ++right;
            }
        }
        return result;
    }
}