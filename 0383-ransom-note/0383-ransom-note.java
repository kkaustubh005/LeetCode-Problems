class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        char[] mag = magazine.toCharArray();
        char[] ran = ransomNote.toCharArray();
        
        for(char a: mag){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        
        for(char b: ran){
            if(map.containsKey(b) && map.get(b)<1){
                return false;
            } else if(map.containsKey(b))
                map.put(b,map.get(b)-1);
            else 
                return false;
            
        }
        return true;
    }
}