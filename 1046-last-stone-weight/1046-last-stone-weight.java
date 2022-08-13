class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n: stones){
            maxHeap.add(n);
        }       
        while(maxHeap.size()>1){
            int head = maxHeap.poll();
            int a = maxHeap.poll();
            if(head!=a){
                int node = head-a;
                maxHeap.add(node);
            }         
        }
        if(maxHeap.size()==0){
            return 0;
        }
        return maxHeap.poll();
    }
}