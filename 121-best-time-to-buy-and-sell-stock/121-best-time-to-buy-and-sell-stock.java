class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0;     
        for(int i=0;i<prices.length;++i){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(prices[i]-minPrice > maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
        
        /* Brute force approach:
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<prices.length-1;++i){
            for(int j=i+1;j<prices.length;++j){
                if(prices[j]>prices[i]){
                    int diff=prices[j]-prices[i];
                    if(diff>max){
                        max=diff;
                    }
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;*/        
    }
}