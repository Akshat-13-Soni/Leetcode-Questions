class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int totalSquareSum=0;
        for(int i=0; i<n; i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i; j<n; j++){
                hs.add(nums.get(j));
                int distinctCount = hs.size();
                totalSquareSum+=distinctCount*distinctCount;
            }
        }
        return totalSquareSum;
    }
}