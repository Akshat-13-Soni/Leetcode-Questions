class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int num:nums){
            totalSum+=num;
        }
        int targetSum = totalSum-x;
        if(targetSum<0){
            return -1;                             //value of x is bigger than array sum
        }
        if(targetSum==0){
            return nums.length;                    //value of x and the array sum is same
        }
        int sum=0, i=0, maxLen=-1;
        for(int j=0; j<nums.length; j++){
            sum+=nums[j];
            while(sum>targetSum){
                sum-=nums[i++];           //shrink from left until sum is again equal to target & note the size
            }
            if(sum==targetSum){
                maxLen = Math.max(maxLen, j-i+1);            //max out of maxLen and windowsize
            }
        }
        if(maxLen==-1){
            return -1;
        }
        else{
            return nums.length-maxLen;
        }
    }
}