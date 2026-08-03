class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len==0){
            return 0;
        }
        Set<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int longestStreak =0;
        for(int num : hs){
            if(!hs.contains(num-1)){
                int n = num;
                int countStreak = 1;
                while(hs.contains(n+1)){
                    n++;
                    countStreak++;
                }
                longestStreak = Math.max(longestStreak, countStreak);
            }
        }
        return longestStreak;
    }
}