class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int med = nums[n/2];
        int totalMoves=0;
        for(int num:nums){
            totalMoves += Math.abs(num-med);
        }
        return totalMoves;
    }
}