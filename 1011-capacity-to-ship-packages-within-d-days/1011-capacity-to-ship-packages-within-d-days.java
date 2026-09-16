class Solution {
    public int daysNeeded(int[] weights, int cap){
        int days=1, load=0;
        for(int i=0; i<weights.length; i++){
            if(weights[i]+load>cap){
                days+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while(low<=high){
            int mid = low+(high-low)/2;
            if(daysNeeded(weights, mid)<=days){  //// If days needed is less or equal to allowed days,try to find smaller capacity on left side
                high=mid-1;
            }
            else{      // Else, need more capacity, search on right side
                low=mid+1;
            }
        }
        return low;
    }
}