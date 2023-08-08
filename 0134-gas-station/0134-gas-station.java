class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //Greedy approach
        int gGas=0, cCost=0, total=0, result=0;
        
        for(int i=0;i<gas.length;i++) {
            gGas+=gas[i];
            cCost+=cost[i];
        }
        
        if(gGas<cCost)
            return -1;
        
        for(int i=0; i<gas.length; i++) {
            total += gas[i] - cost[i];
            if(total<0){
                total=0;
                result=i+1;
            }
        }
        return result;
        
        /* Brute force approach
        int sum=0; int costP=0;
        for(int i=0;i<gas.length;i++) {
            if(gas[i]==0)
                continue;
            if(Arrays.equals(gas,cost))
                return 0;
            if(gas[i]>=cost[i]) {
                sum=gas[i];
                int dest = i;
                int count=gas.length-1;
                while(sum>=cost[i]) {  
                    costP=cost[i];
                    if(count<0)
                        break;
                    if(i==gas.length-1){
                        --count;
                        i=0;
                    }else{
                        --count;
                        ++i;
                    }
                    sum = sum - costP + gas[i];
                    //System.out.println(sum);
                    //System.out.println(count);
                    if(i==dest)
                        return dest;
                }
                i=dest;
            }
        }
        return -1;*/
    }
}