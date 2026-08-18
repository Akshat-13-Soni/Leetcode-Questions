class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){                         //put the array into map
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        if(k==n){                                       //if given subarray size equals the size of array
            int maxVal = Integer.MIN_VALUE;             //set maxVal as minimum intially
            for(int i=0; i<n; i++){
                maxVal = Math.max(maxVal, nums[i]);     //fetch the maximum value from array and return it
            }
            return maxVal;
        }
        if(k==1){              //if subarray size is 1 then check the element with count as 1 and then return the one having maxVal and count 1
            int maxVal=-1;
            for(int i=0; i<n; i++){
                if(map.get(nums[i])==1 && nums[i]>maxVal){
                    maxVal=nums[i];
                }
            }
            return maxVal;
        }
        n=n-1;
        if(nums[0]==nums[n]){
            return -1;
        }
        if(map.get(nums[0])==1 && map.get(nums[n])==1){
            return Math.max(nums[0],nums[n]);
        }
        if(map.get(nums[0])==1 && map.get(nums[n])>1){
            return nums[0];
        }
        if(map.get(nums[0])>1 && map.get(nums[n])==1){
            return nums[n];
        }
        return -1;
    }
}