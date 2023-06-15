class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter=0;   
        int prev=0;
        
        // if(flowerbed[0]==0 && flowerbed[1]==0){
        //     flowerbed[0]=1;
        //     ++counter;
        // }
        
        if(flowerbed.length==1 && flowerbed[0]==0) return true;
        
        for(int i=0;i<flowerbed.length-1;i++){    
            if(flowerbed[i]==0){
                if(prev==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    ++counter;
                }else if(i==flowerbed.length-2 && flowerbed[i+1]==0){
                    ++counter;
                }
            }
            prev=flowerbed[i];
        }
        //if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0) ++counter;
        if(counter>=n)
            return true;
        else
            return false;
    }
}