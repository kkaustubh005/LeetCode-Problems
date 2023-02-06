class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        
        int[] arr = new int[k];
        int count=0;
        
        while(count<k){
            Map.Entry<Integer,Integer> entry = maxHeap.poll();
            arr[count] = entry.getKey();
            ++count;
        }
        
        return arr;
    }
}