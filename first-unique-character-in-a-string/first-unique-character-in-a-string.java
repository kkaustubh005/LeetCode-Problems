class Solution {
    public int firstUniqChar(String s) {
       LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int result=0; char key=0;
        for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {
            result = mapElement.getValue();
            key = mapElement.getKey();
            if(result==1) break;
        }
        if(result!=1) return -1;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(key==s.charAt(i)){
                ans=i;
            }
        }
        return ans;        
        
    }
}