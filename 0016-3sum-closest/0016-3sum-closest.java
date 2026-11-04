// ** Sliding Window won't work because the array has -ve numbers also... **
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=nums[0]+nums[1]+nums[2]; //starting with initial 3 valid triplets as best so far
        for(int i=0; i<nums.length-2; i++){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum-target)<Math.abs(closestSum-target)){
                    closestSum = sum;   //Updating closestSum with best answer if the current sum is more closer to target
                }
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closestSum;
    }
}