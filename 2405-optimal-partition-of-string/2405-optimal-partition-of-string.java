class Solution {
    public int partitionString(String s) {
        char[] sArr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count=0;
        //int index=0;
        int j=0;
        
        while(j<sArr.length){
            if(!set.contains(sArr[j])){
                set.add(sArr[j]);
                j++;
            }else{
                count++;
                set.clear();
            }
        }
        return count+1;
        
    }
}