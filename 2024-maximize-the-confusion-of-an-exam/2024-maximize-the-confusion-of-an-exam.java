class Solution { //Sliding window
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] key = answerKey.toCharArray();
        int len = answerKey.length();
        int start=0, end=0, tCount=0, fCount=0, maxCount=0, maxLength=0;
        //maxCount will store the count of maximum T or F characters are present consecutively.
        for(end=0;end<len;end++){
            if(key[end]=='T'){
                maxCount=Math.max(maxCount, ++tCount);
            }else{
                maxCount=Math.max(maxCount, ++fCount);
            }
            //Below while condition, used to check how many values are there other than max consecutive characters. If they're more than k, then remove them from the sliding window by incrementing start pointer. Max k changes are allowed.
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