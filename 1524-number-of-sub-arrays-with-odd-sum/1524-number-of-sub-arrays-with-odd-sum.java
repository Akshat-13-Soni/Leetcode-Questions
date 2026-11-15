class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int even=1;
        int odd=0;
        int prefix=0;
        long count=0;
        for(int x:arr){
            prefix=(prefix+x)%2;
            if(prefix==1){
                count+=even;
                odd++;
            }
            else{
                count+=odd;
                even++;
            }
        }
        return (int)(count%MOD);
    }
}