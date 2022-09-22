class Solution { //Slidingwindow
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int maxCount=0;
        char[] sArray=s.toCharArray();
       // HashSet<Character> set=new HashSet<>();
        for(int i=0;i<sArray.length;i++){
            //set.clear();
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
            if(count!=0){
                if(count>maxCount) maxCount=count;
                count=0;
            }
        }
        return maxCount;
    }
}