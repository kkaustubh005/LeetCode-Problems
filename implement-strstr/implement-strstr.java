class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }else if(needle.length()>haystack.length()){
            return -1;
        }else if(needle.length()==haystack.length()){
            if(haystack.equals(needle)){
                return 0;
            }else{
                return -1;
            }
        }
        for(int i=0;i<haystack.length();i++){
            int hIndex=i;
            int nIndex=0;
            while(hIndex<haystack.length() && nIndex<needle.length() && haystack.charAt(hIndex)==needle.charAt(nIndex)){
                ++hIndex;
                ++nIndex;
            }
            if(nIndex==needle.length()){
                return i;
            }
        }
        return -1;
        
    }
}