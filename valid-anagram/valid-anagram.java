class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        
        for(int j=0;j<t.length();j++){
            if(map.containsKey(t.charAt(j))){
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }else{
                map.put(t.charAt(j),1);
                System.out.println(t.charAt(j));
            }
        }
        int result=0;
        for(Map.Entry<Character, Integer> mapElement: map.entrySet()){
            result=mapElement.getValue();
            System.out.println(result);
            if(result>0){
                return false;
            }
        }
        return true;
    }
}