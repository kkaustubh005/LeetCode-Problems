/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
    int left = 1;
    int right = n;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (isBadVersion(mid)) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
        
        /* Time limit exceeded
        int half = 1 + (n-1)/2;
        
        if(isBadVersion(half)==false){
            while(isBadVersion(half)==false){
                half=half+1;
            }
            return half;
        }else{
            while(isBadVersion(half)==true){
                half=half-1;
            }
            return half+1;
        }*/
    }
}