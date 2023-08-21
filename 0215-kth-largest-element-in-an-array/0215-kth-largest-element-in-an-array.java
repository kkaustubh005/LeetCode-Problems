class Solution {
    public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2)->n1 - n2);
        
//         for(int n: nums){
//             heap.add(n);
//             if(heap.size()>k){
//                 heap.poll();
//             }
//         }
//         return heap.poll();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int a: nums){
            maxHeap.add(a);
        }
        while(k>1){
            maxHeap.poll();
            --k;
        }
        return maxHeap.poll();
    }
}