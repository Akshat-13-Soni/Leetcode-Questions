class Solution {
    public int lowerbottom(int[] nums, int target){
        int low=0, high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upperbottom(int[] nums, int target){
        int low=0, high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstOcc = lowerbottom(nums, target);
        int lastOcc = upperbottom(nums, target);
        // target not present
        if(firstOcc == nums.length || nums[firstOcc] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{firstOcc, lastOcc-1};
    }
}