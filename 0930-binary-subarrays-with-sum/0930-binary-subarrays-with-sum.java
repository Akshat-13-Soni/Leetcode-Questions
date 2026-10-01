class Solution {
    private int atMost(int[] nums, int k) {
        if (k < 0){                                   //Sum of subarr cant be negative
            return 0;
        }
        //Applying Sliding Window
        int left = 0, sum = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {                     //sum reaches above goal value
                sum -= nums[left];                //shrink from left until sum<=goal
                left++;
            }
            count += right - left + 1;            //count of subarray ending at right
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);  //(sum <= goal)-(sum <= goal-1) = (sum == goal)
    }
}