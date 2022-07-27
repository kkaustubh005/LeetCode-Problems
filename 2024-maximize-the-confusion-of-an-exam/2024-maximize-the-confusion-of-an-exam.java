class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] key = answerKey.toCharArray();
        int len = answerKey.length();
        int start=0;
        int end=0;
        int tCount=0;
        int fCount=0;
        int maxCount=0;
        int maxLength=0;
        
        for(end=0;end<len;end++){
            if(key[end]=='T'){
                maxCount=Math.max(maxCount, ++tCount);
            }else{
                maxCount=Math.max(maxCount, ++fCount);
            }
            while(end-start-maxCount+1>k){
                if(key[start]=='T'){
                    tCount--;
                }else{
                    fCount--;
                }
                start++;
            }
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}