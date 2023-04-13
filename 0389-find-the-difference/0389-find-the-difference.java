class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(char j: arr1){
            if(map.containsKey(j)){
                if(map.get(j)==0){
                    return j;
                }else {
                    map.put(j,map.get(j)-1);
                }
            }else{
                return j;
            }
        }
        return 0;
    }
}