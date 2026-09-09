class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long totalcommas = 0;
        long start = 1000;
        while(start<=n){
            totalcommas += n-start+1;
            start = start*1000;
        }
        return totalcommas;
    }
}