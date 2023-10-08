class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> {
            if(a>b)
                return -1;
            else
                return 1;
        });
        
        int [] arr = new int[26];   
        for(char task: tasks)
            arr[task - 'A']++;
        
        for(int a: arr){
            if(a>0){
                maxHeap.add(a);
            }
        }
             
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        int time=0;
        while(!maxHeap.isEmpty() || !queue.isEmpty()){
            time++;
            if(!maxHeap.isEmpty()){
                int val = maxHeap.poll();
                val--;
                if(val>0)
                    queue.add(new Pair(val, time+n));
            }
            if(!queue.isEmpty() && queue.peek().getValue()==time){
                maxHeap.add(queue.poll().getKey());
            }
        }
        return time;         
    }
}