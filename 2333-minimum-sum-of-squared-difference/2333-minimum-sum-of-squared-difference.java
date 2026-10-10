class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        long k = k1+k2;
        long total=0;
        int maxDiff = 0;
        long ans=0;
        for(int i=0; i<n; i++){
            diff[i] = Math.abs(nums1[i]-nums2[i]);
            total+=diff[i];
            maxDiff = Math.max(maxDiff, diff[i]);
        }
        if(total<=k){
            return 0;
        }
        long[] cnt = new long[maxDiff + 1];
        for (int num : diff){
            cnt[num]++;
        }
        for (int i = maxDiff; i > 0 && k > 0; i--) {
            if (cnt[i] == 0){
                continue;
            }
            long move = Math.min(cnt[i], k);
            cnt[i]-=move;
            cnt[i-1]+=move;
            k-=move;
        }
        for (int i = 0; i <= maxDiff; i++) {
            ans += cnt[i] * i * i;
        }
        return ans;
    }
}