class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxCount = -1;
        int idealDivisor = 0;   
        int n = nums.length;
        int m = divisors.length;
        for (int j = 0; j < m; j++) {
            int count = 0;                       // reset for each divisor
            for (int i = 0; i < n; i++) {
                if (nums[i] % divisors[j] == 0) {
                    count++;
                }
            }
            if (count > maxCount || (count == maxCount && divisors[j] < idealDivisor)) {
                maxCount = count;
                idealDivisor = divisors[j];
            }
        }
        return idealDivisor;    //value of divisor which has highest divisibilty score and is also the smallest
    }
}