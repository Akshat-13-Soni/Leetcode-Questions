class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int num:nums)
        {
            int numCount = hm.getOrDefault(num,0);
            ans+=numCount;
            hm.put(num,numCount+1);
        }
        return ans;
    }
}