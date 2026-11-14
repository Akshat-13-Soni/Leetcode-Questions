class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int currSum=0;
            for(int j=i; j<n && j-i+1<=r; j++){
                currSum+=nums.get(j);
                int windowLen = j-i+1;
                if(windowLen>=l && currSum>0){
                    minSum=Math.min(minSum, currSum);
                }
            }
        }
        return minSum==Integer.MAX_VALUE?-1:minSum;
    }
}