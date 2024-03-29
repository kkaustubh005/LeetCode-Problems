class Solution {
    private String transform(String s){
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();       
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
            }
            builder.append(Integer.toString(map.get(c)));
            builder.append(" ");                       
        }
        return builder.toString();        
    }
    
    public boolean isIsomorphic(String s, String t) {
        return transform(s).equals(transform(t));
    }
}