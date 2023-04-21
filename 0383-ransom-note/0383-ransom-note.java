class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        char[] mag = magazine.toCharArray();
        char[] ran = ransomNote.toCharArray();
        
        if(mag.length<ran.length)
            return false;
        
        for(char a: mag)
            map.put(a, map.getOrDefault(a,0)+1);
        
        for(char b: ran){
            if(!map.containsKey(b) || map.get(b)<1)
                return false;
            map.put(b,map.get(b)-1); 
        }
        
        return true;
    }
}