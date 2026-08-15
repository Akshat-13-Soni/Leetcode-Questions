class Solution {
    public int longestSubsequence(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res ^= nums[i];                             //Calculating XOR of whole array and storing in res
        }
        if(res!=0){                                     //If XOR of whole array is non zero return array itself
            return nums.length;
        }
        else{                                           //otherwise return the array leaving the non zero term
            for(int num:nums){
                if(num!=0){
                    return nums.length-1;
                }
            }
            return 0;
        }
    }
}