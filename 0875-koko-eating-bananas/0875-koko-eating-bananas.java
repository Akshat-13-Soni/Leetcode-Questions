class Solution {
    private long timeNeed(int[] piles, int speed){
        long hours = 0;
        for(int pile:piles){
            hours+=(pile+speed-1)/speed;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int num : piles) {
            max = Math.max(max, num);
        }   
        int low = 1, high=max;
        int k=Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low+(high - low)/2;
            if (timeNeed(piles, mid) <= h) {
                k = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return k;
    }
}