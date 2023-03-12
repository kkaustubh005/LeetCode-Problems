class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int j: map.keySet()){
            if(set.contains(map.get(j)))
                return false;
            else
                set.add(map.get(j));
        }
        return true;
    }
}