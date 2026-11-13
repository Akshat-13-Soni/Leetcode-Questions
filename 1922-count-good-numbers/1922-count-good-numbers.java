class Solution {
    private long modPow(long base, long exp, long mod){
        long result=1;
        base=base%mod;
        while(exp>0){
            if(exp%2==1){
                result  = (result*base)%mod;
            }
            base = (base*base)%mod;
            exp/=2;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long MOD = 1_000_000_007;
        long evenCount = (n+1)/2;
        long oddCount = n/2;
        long ansE = modPow(5, evenCount, MOD);
        long ansO = modPow(4, oddCount, MOD);
        return (int)((ansE*ansO)%MOD);
    }
}