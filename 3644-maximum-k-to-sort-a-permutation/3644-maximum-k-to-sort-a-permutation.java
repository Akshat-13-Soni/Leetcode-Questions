class Solution {
    public int sortPermutation(int[] nums) {
        int sorted = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                sorted = sorted & nums[i];
            }
        }
        if(sorted==-1){
            return 0;
        }
        else{
            return sorted;
        }
    }
}