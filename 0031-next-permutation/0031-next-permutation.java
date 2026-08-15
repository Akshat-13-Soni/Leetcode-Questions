class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i=n-2; i>=0; i--){                 //Finding the Pivot Element
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }                          
        for(int i=n-1; i>index; i--){              //Finding next smallest but greater element than the pivot element
            if(nums[i]>nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index+1, n-1);               //reversing the left over suffix to obtain final permutation   
    }
    public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
    }
    public void reverse(int[] nums, int low, int high){
        while(low<high){
            swap(nums,low,high);
            low++;
            high--;
        }
    }
}