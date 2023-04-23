class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        char[] pArr = pattern.toCharArray();
        String[] sArr = s.split(" ");
        
        StringBuilder p = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        
        for(int i=0;i<pArr.length;i++){
            if(!map1.containsKey(pArr[i])){
                map1.put(pArr[i],i);
                p.append(i);
            }else{
                p.append(map1.get(pArr[i]));
            }
        }
        
        for(int i=0;i<sArr.length;i++){
            if(!map2.containsKey(sArr[i])){
                map2.put(sArr[i],i);
                s1.append(i);
            }else{
                s1.append(map2.get(sArr[i]));
            }
        }
        
        String sFinal=s1.toString();
        String pFinal=p.toString();
                
        return sFinal.equals(pFinal);        
    }
}