class Solution {
    public int averageValue(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int sum=0, average=0;
        for(int i=0; i<n; i++){
            if(nums[i]%6==0){                //numbers divisible by 2 and 3 are divisible by 6
                list.add(nums[i]);
            }
        }
        if(list.size()!=0){
            for(int num:list){
                sum+=num;
            }
            average = sum/list.size();
        }
        return average;
    }
}