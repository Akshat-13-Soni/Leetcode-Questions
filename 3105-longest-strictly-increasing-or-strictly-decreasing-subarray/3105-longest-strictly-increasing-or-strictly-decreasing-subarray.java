class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int incLength=1;
        int decLength=1;
        int maxPossibleLength=1;
        for(int i=1; i<n; i++){
            if(nums[i]>nums[i-1]){
                incLength++;
                decLength=1;
            }
            if(nums[i]<nums[i-1]){
                decLength++;
                incLength=1;
            }
            if(nums[i]==nums[i-1]){
                decLength=1;
                incLength=1;
            }
            maxPossibleLength=Math.max(maxPossibleLength, Math.max(incLength, decLength));
        }
        return maxPossibleLength;
    }
}