class Solution {
    public int subarrSum(int[] nums, int subarr){
        int subarrs = 1;
        int numberSubarrs=0;
        for(int i=0; i<nums.length; i++){
            if((numberSubarrs+nums[i])<=subarr){
                numberSubarrs+=nums[i];
            }
            else{
                subarrs++;
                numberSubarrs=nums[i];
            }
        }
        return subarrs;
    }
    public int splitArray(int[] nums, int k) {
        if(k>nums.length){
            return -1;
        }
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int low = Arrays.stream(nums).max().getAsInt();
        int high=sum;
        while(low<high){
            int mid = low+(high-low)/2;
            if(subarrSum(nums,mid)>k){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}