class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /*double maxAvg=Integer.MIN_VALUE;
        double avg=0;
        double total=0;
        int first=0;
        int last=0;
        int count=0;
        while(first<nums.length){
            if(count<k){
                total+=nums[first];
                System.out.println(total);
                ++count;
                ++first;
                if(count==k){
                    avg=total/k;
                    if(avg>maxAvg){
                        maxAvg=avg;
                    }              
                }
            }else{
                --count;
                total-=nums[last];
                ++last;
            }
        }
        return maxAvg;*/
        
        //Better approach
        
        double sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            res=Math.max(res,sum);
        }
        return res/k; 
    }
}