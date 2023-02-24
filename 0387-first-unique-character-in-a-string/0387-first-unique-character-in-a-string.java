class Solution {
    public int firstUniqChar(String s) {
        char[] cArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c:cArr)
            map.put(c,map.getOrDefault(c,0)+1);
        
        for(int i=0;i<cArr.length;i++){
            if(map.get(cArr[i])==1)
                return i;
        }
        return -1;       
    }
}