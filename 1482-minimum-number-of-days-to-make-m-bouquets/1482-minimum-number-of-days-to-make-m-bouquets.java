class Solution {
    public int possible(int[] bloomDay, int day, int m, int k){
        int count=0;
        int noOfBqt=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                noOfBqt+=(count/k);
                count=0;
            }
        }
        noOfBqt+=(count/k);
        if(noOfBqt>=m){
            return 1;
        }
        else{
            return -1;
        }
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long available=(long)k*m;
        if(available>bloomDay.length){
            return -1;
        }
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int low=min, high=max;
        int ans=high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(bloomDay, mid, m, k)==1){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}