class Solution { 
    public int lengthOfLongestSubstring(String s) {
        /* Not opitmised
        int count=0;
        int maxCount=0;
        char[] sArray=s.toCharArray();
        for(int i=0;i<sArray.length;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<sArray.length;j++){
                if(set.contains(sArray[j])){
                    if(count>maxCount) maxCount=count;
                    count=0;
                    break;
                }else{
                    set.add(sArray[j]);
                    ++count;
                }
            }
            //When there are no repeating characters in the string
            if(count!=0){
                if(count>maxCount) maxCount=count;
                count=0;
            }
        }
        return maxCount;*/
        
        //Sliding Window        
        int i=0, j=0, maxCount=0;
        HashSet<Character> set= new HashSet<>();
        
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxCount = Math.max(set.size(), maxCount);
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxCount;       
    }
}