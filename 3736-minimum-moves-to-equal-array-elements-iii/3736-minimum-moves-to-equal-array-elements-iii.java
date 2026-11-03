class Solution {
    public int minMoves(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        for(int num:nums){
            maximum = Math.max(maximum, num);
        }
        int maxTotalMoves = 0;
        for(int num:nums){
            maxTotalMoves += (maximum-num);
        }
        return maxTotalMoves;
    }
}