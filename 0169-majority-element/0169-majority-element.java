class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element=0;;
        for(int i=0; i<nums.length;i++){
            if(count==0){
                count=1;                         //initially
                element=nums[i];                 //set element as that number first
            }
            else if(nums[i] == element){         
                count++;                         //if ahead the number is same as the element increment the count
            }
            else{                                
                count--;                         //if not decrement the count
            }
        }
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == element){
                count1++;
            }
        }
        if(count1>(nums.length/2)){
            return element;
        }
        return -1;
    }
}