class Solution {
    public int[][] kClosest(int[][] points, int k) {
       /* HashMap<int [], Integer> map = new HashMap<>();
        
        for(int[] point: points){
            int distance = (point[0]*point[0]) + (point[1]*point[1]);
            map.put(point, distance);
        }
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((n1,n2) -> {
            if(map.get(n1)>map.get(n2))     //If we want to swap then return 1 else -1
                return -1;
            else
                return 1;
        });
        
        //PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((n1,n2) -> map.get(n2) - map.get(n1));
        
        for(int [] point: points){
            maxHeap.add(point);
            if(maxHeap.size()>k)
                maxHeap.poll();
        }
        
        int[][] result = new int[k][];
        int count=0;
        while(maxHeap.size()>0){
            result[count++]=maxHeap.poll();
        }
        return result;*/
        
        //Better Solution
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> {
            if((a[0]*a[0]+a[1]*a[1]) > (b[0]*b[0]+b[1]*b[1]))
                return -1;  //dont swap (descending order)
            else
                return 1;
        });
     
        for(int [] point: points){
            maxHeap.add(point);
            if(maxHeap.size()>k)
                maxHeap.poll();
        }
        
        int[][] result = new int[k][];
        int count=0;
        while(maxHeap.size()>0){
            result[count++]=maxHeap.poll();
        }
        return result;
        
    }
}