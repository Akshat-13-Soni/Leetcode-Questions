class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char jwl:jewels.toCharArray()){
            for(char stn:stones.toCharArray()){
                if(jwl==stn){
                    count++;
                }
            }
        }
        return count;
    }
}