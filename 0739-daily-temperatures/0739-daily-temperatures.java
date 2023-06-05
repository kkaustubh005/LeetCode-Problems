class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int curDay=0;curDay<temperatures.length;curDay++){
            int currentTemp=temperatures[curDay];
            
            while(!stack.empty() && temperatures[stack.peek()]<currentTemp){
                int prevDay=stack.pop();
                result[prevDay]=curDay-prevDay;
            }
            stack.push(curDay);
        }
        
        return result;
        
        
        
        /* //Time limit exceeded (Brute Force Approach) 
        int [] result = new int[temperatures.length];
        int index=0;
        for(int i=0;i<temperatures.length;i++){
            index=i+1;
            int count=1;
            while(i!=index){
                if(index>=temperatures.length){
                    result[i]=0;
                    index=i;
                }else if(temperatures[index]<=temperatures[i]){
                    ++count;
                    ++index;
                }else{
                    result[i]=count;
                    index=i;
                }
            }
        }
        return result;*/
    }
}