class Solution {
    public int lengthOfLastWord(String s) {
        String[] sArr= s.split(" ");
        for(int i=sArr.length-1;i>=0;i--){
            if(!sArr[i].equals(" "))
                return sArr[i].length();
        }
        return 0;
    }
}