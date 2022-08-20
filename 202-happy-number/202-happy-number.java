class Solution {
   
    public boolean isHappy(int n) {
      int fast=n;int slow=n;
        
        do{
            slow=comp(slow);
            fast=comp(fast);
            fast=comp(fast);
        }while(slow!=fast);
            if(slow==1){ return true;}
        else{
            return false;
        }       
    }
    
   public int comp(int n){
            int sum=0; int total;
           while(n>0){
          total=n%10;
          sum+=total*total;
          n=n/10;                
        }
            return sum;
        }
}