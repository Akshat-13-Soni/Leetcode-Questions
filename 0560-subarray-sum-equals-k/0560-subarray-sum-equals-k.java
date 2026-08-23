class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0, count = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);     //prefix sum is 0 before starting array iteration
        for(int i=1; i<=n; i++){
            prefixSum+=nums[i-1];               //current prefix Sum
            int currPreSum = prefixSum-k;       //using formula currentPrefixSum-prefixSum=k
            if(map.containsKey(currPreSum)){       //If this required prefix sum appeared before, get its value
                count+= map.get(currPreSum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);  //Store the current prefix sum for future elements
        }
        return count;
    }
}