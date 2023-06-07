class Solution { //Binary search approach
    public int minEatingSpeed(int[] piles, int h) {
        int left=1; int right=1;
        for(int pile: piles){
            right=Math.max(pile,right);
        }
        
        while(left<right){
            int mid=(left+right)/2;
            int hourSpent=0;
            
            for(int pile: piles){
                hourSpent+=Math.ceil((double) pile/mid);
            }
            
            if(hourSpent>h){  //hours spent is inversely proportional to speed
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return right;
    }
}