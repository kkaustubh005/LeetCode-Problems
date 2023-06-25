class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(char i: word1.toCharArray())
            map1.put(i,map1.getOrDefault(i,0)+1);
        
        for(char i: word2.toCharArray())
            map2.put(i,map2.getOrDefault(i,0)+1);
        //Check whether all the characters are same in both strings
        if(!map1.keySet().equals(map2.keySet()))
            return false;
        //Check whether frequency of the characters are same
        ArrayList<Integer> list1 = new ArrayList<>(map1.values());
        ArrayList<Integer> list2 = new ArrayList<>(map2.values());
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        return list1.equals(list2);
    }
}