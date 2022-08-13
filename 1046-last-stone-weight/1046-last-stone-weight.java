class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n: stones){
            maxHeap.add(n);
            //System.out.println(maxHeap.peek());
        }       
        //System.out.println(maxHeap.size());
        while(maxHeap.size()>1){
            //System.out.println("first "+maxHeap.peek());
            int head = maxHeap.poll();
            //System.out.println("second "+maxHeap.peek());
            int a = maxHeap.poll();
            //System.out.println(maxHeap.size());
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