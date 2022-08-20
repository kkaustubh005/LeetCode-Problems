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

    /* Using Hashset
    
    class Solution {

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
}
    */