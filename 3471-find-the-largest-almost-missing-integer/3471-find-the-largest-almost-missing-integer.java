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
        n=n-1;                               //setting n to n-1 to get the index of last element since as of now n is pointing to n is size
                                            //of array then if we didn't do n-1 then nums[n] would go out of bound for checking the element..

        if(nums[0]==nums[n]){                   //*If both ends hold the same value, that value's count is automatically ≥ 2, 
            return -1;                          //so neither end can be unique → no candidate exists → -1.
        }
        if(map.get(nums[0])==1 && map.get(nums[n])==1){
            return Math.max(nums[0],nums[n]);                  // both ends unique → take the larger
        }
        if(map.get(nums[0])==1 && map.get(nums[n])>1){
            return nums[0];                                    // only left end unique
        }
        if(map.get(nums[0])>1 && map.get(nums[n])==1){
            return nums[n];                                    // only right end unique
        }
        return -1;                                             // neither end unique → no candidate
    }
}