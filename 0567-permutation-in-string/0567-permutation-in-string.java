class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        int s1Len = s1.length();
        Map<Character, Integer> s1Map = new HashMap<>();
        
        for(int x=0;x<s1Len;x++){
            s1Map.put(s1Array[x],s1Map.getOrDefault(s1Array[x],0)+1);
        }
        
        Map<Character, Integer> s2Map = new HashMap<>();
        for(int i=0;i<s2.length();i++){
            
            s2Map.put(s2Array[i],s2Map.getOrDefault(s2Array[i],0)+1);
            
            if(i>=s1Len){
                if(s2Map.get(s2Array[i-s1Len])==1){
                    s2Map.remove(s2Array[i-s1Len]);
                }else{
                    s2Map.put(s2Array[i-s1Len],s2Map.get(s2Array[i-s1Len])-1);
                }
            }
            
            if(s1Map.equals(s2Map)){
                return true;
            }
        }
        return false;
        
    }
}