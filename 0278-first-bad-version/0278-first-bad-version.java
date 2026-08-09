/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1){
            return n;
        }
        int low = 1, mid;
        int high = n;
        while(low<high){
            mid = low + (high-low) / 2;
            if(isBadVersion(mid)==true){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}