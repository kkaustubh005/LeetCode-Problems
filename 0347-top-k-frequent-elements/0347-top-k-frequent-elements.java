class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: nums)
            map.put(a, map.getOrDefault(a,0)+1);
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
        (n1, n2) -> map.get(n2) - map.get(n1));
        
        for(int n: map.keySet()) {
            maxHeap.add(n);
        }
        
        int[] top = new int[k];
        for(int i=k-1; i>=0; i--)
            top[i]=maxHeap.poll();
        
        return top;
    }
}