class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();        
        for(String word: words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }else{
                map.put(word,1);
            }
        }
        
        PriorityQueue<Map.Entry<String,Integer>> maxHeap = new PriorityQueue<>(
            (a,b) -> a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue());
        
        maxHeap.addAll(map.entrySet());
        
        int counter=0;
        ArrayList<String> result = new ArrayList<>();
        while(counter<k){
            result.add(maxHeap.poll().getKey());
            ++counter;
        }
        return result;
        
    }
}