class Solution {
    public int averageValue(int[] nums) {
        int n = nums.length;
        int sum=0, count=0;
        for(int i=0; i<n; i++){
            if(nums[i]%6==0){                //numbers divisible by 2 and 3 are divisible by 6
                sum+=nums[i];
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }
}