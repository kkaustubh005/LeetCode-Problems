class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<int [], Integer> map = new HashMap<>();
        
        for(int[] point: points){
            //int distance = (int)Math.sqrt((point[0]*point[0]) + (point[1]*point[1]));
            int distance = (point[0]*point[0]) + (point[1]*point[1]);
            map.put(point, distance);
        }
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((n1,n2) -> {
            if(map.get(n1)>map.get(n2))
                return -1;
            else
                return 1;
        });
        
        for(int [] point: points){
            minHeap.add(point);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        
        int[][] result = new int[k][];
        int count=0;
        while(minHeap.size()>0){
            result[count++]=minHeap.poll();
        }
        return result;
    }
}