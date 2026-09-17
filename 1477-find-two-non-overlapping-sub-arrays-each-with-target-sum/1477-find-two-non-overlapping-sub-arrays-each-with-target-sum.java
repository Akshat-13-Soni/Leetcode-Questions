class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] dp = new int[n]; // dp[i] = shortest valid window ending at or before index i
        Arrays.fill(dp, Integer.MAX_VALUE);
        int left = 0, sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                int currLen = right - left + 1;
                if (left > 0 && dp[left - 1] != Integer.MAX_VALUE) {
                    result = Math.min(result, currLen + dp[left - 1]);
                }
                dp[right] = (right > 0) ? Math.min(dp[right - 1], currLen) : currLen;
            } else {
                dp[right] = (right > 0) ? dp[right - 1] : Integer.MAX_VALUE;
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}